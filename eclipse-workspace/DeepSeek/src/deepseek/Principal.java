package deepseek;
import utilidades.Leer;

public class Principal {

}
// Configurar look and feel
setupLookAndFeel();

// Inicializar configuración
config = Configuracion.getInstance();

// Configurar logger
setupLogger();

// Inicializar base de datos
initializeDatabase();

// Mostrar ventana de login
SwingUtilities.invokeLater(() -> {
    new LoginFrame().setVisible(true);
});
}

private static void setupLookAndFeel() {
try {
    UIManager.setLookAndFeel(new FlatDarkLaf());
    UIManager.put("Button.arc", 8);
    UIManager.put("Component.arc", 8);
    UIManager.put("TextComponent.arc", 5);
} catch (Exception e) {
    logger.severe("Error configurando Look and Feel: " + e.getMessage());
}
}

private static void setupLogger() {
try {
    Logger rootLogger = Logger.getLogger("");
    Handler[] handlers = rootLogger.getHandlers();
    for (Handler handler : handlers) {
        rootLogger.removeHandler(handler);
    }
    
    FileHandler fileHandler = new FileHandler("logs/erp_system.log", true);
    fileHandler.setFormatter(new SimpleFormatter());
    rootLogger.addHandler(fileHandler);
    
    ConsoleHandler consoleHandler = new ConsoleHandler();
    consoleHandler.setFormatter(new SimpleFormatter());
    rootLogger.addHandler(consoleHandler);
    
    rootLogger.setLevel(Level.ALL);
} catch (Exception e) {
    System.err.println("Error configurando logger: " + e.getMessage());
}
}

private static void initializeDatabase() {
try {
    dbManager = DatabaseManager.getInstance();
    if (!dbManager.testConnection()) {
        JOptionPane.showMessageDialog(null, 
            "Error conectando a la base de datos", 
            "Error", 
            JOptionPane.ERROR_MESSAGE);
        System.exit(1);
    }
    
    // Crear tablas si no existen
    dbManager.initializeDatabase();
    logger.info("Base de datos inicializada correctamente");
    
} catch (Exception e) {
    logger.severe("Error inicializando base de datos: " + e.getMessage());
    JOptionPane.showMessageDialog(null, 
        "Error crítico en la base de datos: " + e.getMessage(),
        "Error Fatal", 
        JOptionPane.ERROR_MESSAGE);
    System.exit(1);
}
}

public static Configuracion getConfig() {
return config;
}

public static DatabaseManager getDbManager() {
return dbManager;
}
}
2. Gestor de Base de Datos
DatabaseManager.java (~400 líneas)
java
package com.empresa.erp.dao;

import java.sql.*;
import java.util.logging.Logger;
import com.empresa.erp.util.Configuracion;

public class DatabaseManager {
private static DatabaseManager instance;
private Connection connection;
private static final Logger logger = Logger.getLogger(DatabaseManager.class.getName());

private DatabaseManager() {
initializeConnection();
}

public static synchronized DatabaseManager getInstance() {
if (instance == null) {
    instance = new DatabaseManager();
}
return instance;
}

private void initializeConnection() {
try {
    Configuracion config = Configuracion.getInstance();
    String url = config.getProperty("database.url", "jdbc:mysql://localhost:3306/erp_system");
    String user = config.getProperty("database.user", "root");
    String password = config.getProperty("database.password", "");
    
    Class.forName("com.mysql.cj.jdbc.Driver");
    connection = DriverManager.getConnection(url, user, password);
    connection.setAutoCommit(false);
    
    logger.info("Conexión a base de datos establecida");
} catch (Exception e) {
    logger.severe("Error estableciendo conexión: " + e.getMessage());
}
}

public boolean testConnection() {
try {
    return connection != null && !connection.isClosed();
} catch (SQLException e) {
    return false;
}
}

public void initializeDatabase() throws SQLException {
createTables();
insertInitialData();
}

private void createTables() throws SQLException {
String[] createTables = {
    // Tabla de usuarios
    "CREATE TABLE IF NOT EXISTS usuarios (" +
    "id INT AUTO_INCREMENT PRIMARY KEY, " +
    "username VARCHAR(50) UNIQUE NOT NULL, " +
    "password VARCHAR(255) NOT NULL, " +
    "nombre VARCHAR(100) NOT NULL, " +
    "email VARCHAR(100) UNIQUE NOT NULL, " +
    "rol ENUM('ADMIN', 'GERENTE', 'SUPERVISOR', 'EMPLEADO') NOT NULL, " +
    "activo BOOLEAN DEFAULT TRUE, " +
    "fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP, " +
    "ultimo_login TIMESTAMP NULL)",
    
    // Tabla de clientes
    "CREATE TABLE IF NOT EXISTS clientes (" +
    "id INT AUTO_INCREMENT PRIMARY KEY, " +
    "codigo VARCHAR(20) UNIQUE NOT NULL, " +
    "nombre VARCHAR(200) NOT NULL, " +
    "tipo ENUM('NATURAL', 'JURIDICO') NOT NULL, " +
    "documento VARCHAR(20) UNIQUE NOT NULL, " +
    "email VARCHAR(100), " +
    "telefono VARCHAR(20), " +
    "direccion TEXT, " +
    "ciudad VARCHAR(100), " +
    "pais VARCHAR(100), " +
    "limite_credito DECIMAL(15,2) DEFAULT 0, " +
    "estado ENUM('ACTIVO', 'INACTIVO', 'SUSPENDIDO') DEFAULT 'ACTIVO', " +
    "fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP)",
    
    // Tabla de productos
    "CREATE TABLE IF NOT EXISTS productos (" +
    "id INT AUTO_INCREMENT PRIMARY KEY, " +
    "codigo VARCHAR(20) UNIQUE NOT NULL, " +
    "nombre VARCHAR(200) NOT NULL, " +
    "descripcion TEXT, " +
    "categoria VARCHAR(100), " +
    "precio_compra DECIMAL(15,2) NOT NULL, " +
    "precio_venta DECIMAL(15,2) NOT NULL, " +
    "stock_actual INT DEFAULT 0, " +
    "stock_minimo INT DEFAULT 0, " +
    "stock_maximo INT DEFAULT 0, " +
    "unidad_medida VARCHAR(20), " +
    "proveedor_id INT, " +
    "activo BOOLEAN DEFAULT TRUE, " +
    "fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP)",
    
    // Tabla de ventas
    "CREATE TABLE IF NOT EXISTS ventas (" +
    "id INT AUTO_INCREMENT PRIMARY KEY, " +
    "numero_factura VARCHAR(50) UNIQUE NOT NULL, " +
    "cliente_id INT NOT NULL, " +
    "usuario_id INT NOT NULL, " +
    "fecha_venta TIMESTAMP DEFAULT CURRENT_TIMESTAMP, " +
    "subtotal DECIMAL(15,2) NOT NULL, " +
    "impuesto DECIMAL(15,2) NOT NULL, " +
    "descuento DECIMAL(15,2) DEFAULT 0, " +
    "total DECIMAL(15,2) NOT NULL, " +
    "estado ENUM('PENDIENTE', 'PAGADA', 'CANCELADA') DEFAULT 'PENDIENTE', " +
    "metodo_pago ENUM('EFECTIVO', 'TARJETA', 'TRANSFERENCIA'), " +
    "FOREIGN KEY (cliente_id) REFERENCES clientes(id), " +
    "FOREIGN KEY (usuario_id) REFERENCES usuarios(id))",
    
    // Tabla de detalle de ventas
    "CREATE TABLE IF NOT EXISTS detalle_ventas (" +
    "id INT AUTO_INCREMENT PRIMARY KEY, " +
    "venta_id INT NOT NULL, " +
    "producto_id INT NOT NULL, " +
    "cantidad INT NOT NULL, " +
    "precio_unitario DECIMAL(15,2) NOT NULL, " +
    "subtotal DECIMAL(15,2) NOT NULL, " +
    "FOREIGN KEY (venta_id) REFERENCES ventas(id), " +
    "FOREIGN KEY (producto_id) REFERENCES productos(id))",
    
    // Tabla de inventario
    "CREATE TABLE IF NOT EXISTS movimientos_inventario (" +
    "id INT AUTO_INCREMENT PRIMARY KEY, " +
    "producto_id INT NOT NULL, " +
    "tipo ENUM('ENTRADA', 'SALIDA', 'AJUSTE') NOT NULL, " +
    "cantidad INT NOT NULL, " +
    "precio_unitario DECIMAL(15,2), " +
    "referencia VARCHAR(100), " +
    "observaciones TEXT, " +
    "usuario_id INT NOT NULL, " +
    "fecha_movimiento TIMESTAMP DEFAULT CURRENT_TIMESTAMP, " +
    "FOREIGN KEY (producto_id) REFERENCES productos(id), " +
    "FOREIGN KEY (usuario_id) REFERENCES usuarios(id))"
};

try (Statement stmt = connection.createStatement()) {
    for (String sql : createTables) {
        stmt.execute(sql);
    }
    connection.commit();
    logger.info("Tablas creadas exitosamente");
} catch (SQLException e) {
    connection.rollback();
    throw e;
}
}

private void insertInitialData() throws SQLException {
// Insertar usuario administrador por defecto
String checkAdmin = "SELECT COUNT(*) FROM usuarios WHERE username = 'admin'";
try (Statement stmt = connection.createStatement();
     ResultSet rs = stmt.executeQuery(checkAdmin)) {
    
    if (rs.next() && rs.getInt(1) == 0) {
        String insertAdmin = "INSERT INTO usuarios (username, password, nombre, email, rol) " +
                           "VALUES ('admin', '" + hashPassword("admin123") + "', 'Administrador', 'admin@empresa.com', 'ADMIN')";
        stmt.execute(insertAdmin);
        connection.commit();
        logger.info("Usuario administrador creado");
    }
}
}

private String hashPassword(String password) {
// Implementación básica de hash (en producción usar BCrypt)
return Integer.toString(password.hashCode());
}

public Connection getConnection() throws SQLException {
if (connection == null || connection.isClosed()) {
    initializeConnection();
}
return connection;
}

public void closeConnection() {
try {
    if (connection != null && !connection.isClosed()) {
        connection.close();
    }
} catch (SQLException e) {
    logger.severe("Error cerrando conexión: " + e.getMessage());
}
}
}
3. Sistema de Autenticación y Seguridad
AuthenticationService.java (~300 líneas)
java
package com.empresa.erp.security;

import java.sql.*;
import java.util.logging.Logger;
import com.empresa.erp.dao.DatabaseManager;
import com.empresa.erp.model.Usuario;

public class AuthenticationService {
private static final Logger logger = Logger.getLogger(AuthenticationService.class.getName());
private static AuthenticationService instance;

private AuthenticationService() {}

public static synchronized AuthenticationService getInstance() {
if (instance == null) {
    instance = new AuthenticationService();
}
return instance;
}

public Usuario authenticate(String username, String password) {
String sql = "SELECT id, username, password, nombre, email, rol, activo, ultimo_login " +
            "FROM usuarios WHERE username = ? AND activo = TRUE";

try (Connection conn = DatabaseManager.getInstance().getConnection();
     PreparedStatement pstmt = conn.prepareStatement(sql)) {
    
    pstmt.setString(1, username);
    ResultSet rs = pstmt.executeQuery();
    
    if (rs.next()) {
        String storedPassword = rs.getString("password");
        if (verifyPassword(password, storedPassword)) {
            Usuario usuario = new Usuario();
            usuario.setId(rs.getInt("id"));
            usuario.setUsername(rs.getString("username"));
            usuario.setNombre(rs.getString("nombre"));
            usuario.setEmail(rs.getString("email"));
            usuario.setRol(Usuario.Rol.valueOf(rs.getString("rol")));
            usuario.setActivo(rs.getBoolean("activo"));
            usuario.setUltimoLogin(rs.getTimestamp("ultimo_login"));
            
            // Actualizar último login
            updateLastLogin(usuario.getId());
            
            logger.info("Usuario autenticado: " + username);
            return usuario;
        }
    }
} catch (SQLException e) {
    logger.severe("Error en autenticación: " + e.getMessage());
}

logger.warning("Intento de autenticación fallido para usuario: " + username);
return null;
}

private boolean verifyPassword(String inputPassword, String storedPassword) {
// En producción usar BCrypt
return Integer.toString(inputPassword.hashCode()).equals(storedPassword);
}

private void updateLastLogin(int userId) {
String sql = "UPDATE usuarios SET ultimo_login = CURRENT_TIMESTAMP WHERE id = ?";
try (Connection conn = DatabaseManager.getInstance().getConnection();
     PreparedStatement pstmt = conn.prepareStatement(sql)) {
    
    pstmt.setInt(1, userId);
    pstmt.executeUpdate();
    conn.commit();
} catch (SQLException e) {
    logger.severe("Error actualizando último login: " + e.getMessage());
}
}

public boolean hasPermission(Usuario usuario, String permission) {
// Lógica de permisos basada en roles
switch (usuario.getRol()) {
    case ADMIN:
        return true;
    case GERENTE:
        return !permission.startsWith("SYSTEM");
    case SUPERVISOR:
        return permission.startsWith("READ") || 
               permission.startsWith("WRITE") && !permission.contains("DELETE");
    case EMPLEADO:
        return permission.startsWith("READ") || 
               permission.equals("WRITE_VENTAS");
    default:
        return false;
}
}

public boolean changePassword(int userId, String currentPassword, String newPassword) {
// Implementación de cambio de contraseña
return true;
}
}
4. Modelos de Datos (continuación)
Usuario.java (~150 líneas)
java
package com.empresa.erp.model;

import java.util.Date;

public class Usuario {
private int id;
private String username;
private String password;
private String nombre;
private String email;
private Rol rol;
private boolean activo;
private Date fechaCreacion;
private Date ultimoLogin;

public enum Rol {
ADMIN, GERENTE, SUPERVISOR, EMPLEADO
}

// Constructores
public Usuario() {}

public Usuario(String username, String nombre, String email, Rol rol) {
this.username = username;
this.nombre = nombre;
this.email = email;
this.rol = rol;
this.activo = true;
}

// Getters y Setters
public int getId() { return id; }
public void setId(int id) { this.id = id; }

public String getUsername() { return username; }
public void setUsername(String username) { this.username = username; }

public String getPassword() { return password; }
public void setPassword(String password) { this.password = password; }

public String getNombre() { return nombre; }
public void setNombre(String nombre) { this.nombre = nombre; }

public String getEmail() { return email; }
public void setEmail(String email) { this.email = email; }

public Rol getRol() { return rol; }
public void setRol(Rol rol) { this.rol = rol; }

public boolean isActivo() { return activo; }
public void setActivo(boolean activo) { this.activo = activo; }

public Date getFechaCreacion() { return fechaCreacion; }
public void setFechaCreacion(Date fechaCreacion) { this.fechaCreacion = fechaCreacion; }

public Date getUltimoLogin() { return ultimoLogin; }
public void setUltimoLogin(Date ultimoLogin) { this.ultimoLogin = ultimoLogin; }

@Override
public String toString() {
return nombre + " (" + username + ")";
}

@Override
public boolean equals(Object obj) {
if (this == obj) return true;
if (obj == null || getClass() != obj.getClass()) return false;
Usuario usuario = (Usuario) obj;
return id == usuario.id;
}

@Override
public int hashCode() {
return Integer.hashCode(id);
}
}
Cliente.java (~200 líneas)
java
package com.empresa.erp.model;

import java.util.Date;

public class Cliente {
private int id;
private String codigo;
private String nombre;
private Tipo tipo;
private String documento;
private String email;
private String telefono;
private String direccion;
private String ciudad;
private String pais;
private double limiteCredito;
private Estado estado;
private Date fechaRegistro;

public enum Tipo {
NATURAL, JURIDICO
}

public enum Estado {
ACTIVO, INACTIVO, SUSPENDIDO
}

// Constructores
public Cliente() {}

public Cliente(String codigo, String nombre, Tipo tipo, String documento) {
this.codigo = codigo;
this.nombre = nombre;
this.tipo = tipo;
this.documento = documento;
this.estado = Estado.ACTIVO;
}

// Getters y Setters
public int getId() { return id; }
public void setId(int id) { this.id = id; }

public String getCodigo() { return codigo; }
public void setCodigo(String codigo) { this.codigo = codigo; }

public String getNombre() { return nombre; }
public void setNombre(String nombre) { this.nombre = nombre; }

public Tipo getTipo() { return tipo; }
public void setTipo(Tipo tipo) { this.tipo = tipo; }

public String getDocumento() { return documento; }
public void setDocumento(String documento) { this.documento = documento; }

public String getEmail() { return email; }
public void setEmail(String email) { this.email = email; }

public String getTelefono() { return telefono; }
public void setTelefono(String telefono) { this.telefono = telefono; }

public String getDireccion() { return direccion; }
public void setDireccion(String direccion) { this.direccion = direccion; }

public String getCiudad() { return ciudad; }
public void setCiudad(String ciudad) { this.ciudad = ciudad; }

public String getPais() { return pais; }
public void setPais(String pais) { this.pais = pais; }

public double getLimiteCredito() { return limiteCredito; }
public void setLimiteCredito(double limiteCredito) { this.limiteCredito = limiteCredito; }

public Estado getEstado() { return estado; }
public void setEstado(Estado estado) { this.estado = estado; }

public Date getFechaRegistro() { return fechaRegistro; }
public void setFechaRegistro(Date fechaRegistro) { this.fechaRegistro = fechaRegistro; }

// Métodos de negocio
public boolean puedeComprar(double monto) {
return estado == Estado.ACTIVO && monto <= limiteCredito;
}

public String getDireccionCompleta() {
return String.format("%s, %s, %s", direccion != null ? direccion : "", 
                   ciudad != null ? ciudad : "", pais != null ? pais : "");
}

@Override
public String toString() {
return nombre + " (" + documento + ")";
}
}
5. Interfaz Gráfica - Panel Principal
MainFrame.java (~800 líneas)
java
package com.empresa.erp.gui;

import com.empresa.erp.model.Usuario;
import com.formdev.flatlaf.extras.FlatSVGIcon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame {
private Usuario usuario;
private JPanel contentPanel;
private CardLayout cardLayout;

// Componentes de la interfaz
private JLabel lblUsuario;
private JLabel lblRol;
private JLabel lblFecha;

public MainFrame(Usuario usuario) {
this.usuario = usuario;
initializeUI();
setupEventHandlers();
showDashboard();
}

private void initializeUI() {
setTitle("Sistema ERP - Empresa XYZ");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setExtendedState(JFrame.MAXIMIZED_BOTH);

// Crear layout principal
setLayout(new BorderLayout());

// Crear barra superior
add(createTopBar(), BorderLayout.NORTH);

// Crear menú lateral
add(createSidebar(), BorderLayout.WEST);

// Crear panel de contenido
contentPanel = new JPanel();
cardLayout = new CardLayout();
contentPanel.setLayout(cardLayout);
add(contentPanel, BorderLayout.CENTER);

// Crear barra de estado
add(createStatusBar(), BorderLayout.SOUTH);

// Cargar paneles
loadPanels();
}

private JPanel createTopBar() {
JPanel topBar = new JPanel(new BorderLayout());
topBar.setBackground(new Color(45, 45, 48));
topBar.setPreferredSize(new Dimension(getWidth(), 60));
topBar.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

// Logo y título
JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
titlePanel.setBackground(new Color(45, 45, 48));

JLabel lblTitle = new JLabel("SISTEMA ERP");
lblTitle.setForeground(Color.WHITE);
lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 18));
titlePanel.add(lblTitle);

// Información de usuario
JPanel userPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
userPanel.setBackground(new Color(45, 45, 48));

lblUsuario = new JLabel("Usuario: " + usuario.getNombre());
lblUsuario.setForeground(Color.WHITE);
lblRol = new JLabel("Rol: " + usuario.getRol());
lblRol.setForeground(Color.LIGHT_GRAY);

JButton btnLogout = new JButton("Cerrar Sesión");
btnLogout.addActionListener(e -> logout());

userPanel.add(lblUsuario);
userPanel.add(Box.createHorizontalStrut(10));
userPanel.add(lblRol);
userPanel.add(Box.createHorizontalStrut(20));
userPanel.add(btnLogout);

topBar.add(titlePanel, BorderLayout.WEST);
topBar.add(userPanel, BorderLayout.EAST);

return topBar;
}

private JPanel createSidebar() {
JPanel sidebar = new JPanel();
sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
sidebar.setBackground(new Color(60, 63, 65));
sidebar.setPreferredSize(new Dimension(250, getHeight()));
sidebar.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

// Botones del menú
String[] menuItems = {
    "Dashboard", "Clientes", "Productos", "Ventas", 
    "Inventario", "Reportes", "Usuarios", "Configuración"
};

String[] icons = {
    "dashboard", "users", "package", "shopping-cart",
    "warehouse", "bar-chart", "user-check", "settings"
};

ButtonGroup buttonGroup = new ButtonGroup();

for (int i = 0; i < menuItems.length; i++) {
    JToggleButton btn = createMenuButton(menuItems[i], icons[i]);
    buttonGroup.add(btn);
    sidebar.add(btn);
    sidebar.add(Box.createVerticalStrut(5));
    
    final String panelName = menuItems[i];
    btn.addActionListener(e -> showPanel(panelName));
}

sidebar.add(Box.createVerticalGlue());
return sidebar;
}

private JToggleButton createMenuButton(String text, String iconName) {
JToggleButton button = new JToggleButton(text);
button.setAlignmentX(Component.LEFT_ALIGNMENT);
button.setMaximumSize(new Dimension(230, 45));
button.setPreferredSize(new Dimension(230, 45));
button.setHorizontalAlignment(SwingConstants.LEFT);
button.setBackground(new Color(60, 63, 65));
button.setForeground(Color.WHITE);
button.setFocusPainted(false);
button.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 5));

// Cargar icono SVG
try {
    FlatSVGIcon icon = new FlatSVGIcon("icons/" + iconName + ".svg", 20, 20);
    button.setIcon(icon);
} catch (Exception e) {
    System.err.println("Error cargando icono: " + e.getMessage());
}

return button;
}

private JPanel createStatusBar() {
JPanel statusBar = new JPanel(new BorderLayout());
statusBar.setBackground(new Color(0, 122, 204));
statusBar.setPreferredSize(new Dimension(getWidth(), 25));
statusBar.setBorder(BorderFactory.createEmptyBorder(3, 10, 3, 10));

lblFecha = new JLabel();
updateDate();
lblFecha.setForeground(Color.WHITE);

JLabel lblVersion = new JLabel("v1.0.0 - Sistema ERP");
lblVersion.setForeground(Color.WHITE);

statusBar.add(lblFecha, BorderLayout.WEST);
statusBar.add(lblVersion, BorderLayout.EAST);

// Actualizar fecha cada minuto
Timer timer = new Timer(60000, e -> updateDate());
timer.start();

return statusBar;
}

private void updateDate() {
lblFecha.setText(new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm").format(new java.util.Date()));
}

private void loadPanels() {
contentPanel.add(new DashboardPanel(usuario), "Dashboard");
contentPanel.add(new ClientesPanel(), "Clientes");
contentPanel.add(new ProductosPanel(), "Productos");
contentPanel.add(new VentasPanel(usuario), "Ventas");
contentPanel.add(new InventarioPanel(), "Inventario");
contentPanel.add(new ReportesPanel(), "Reportes");
contentPanel.add(new UsuariosPanel(), "Usuarios");
contentPanel.add(new ConfiguracionPanel(), "Configuración");
}

private void showPanel(String panelName) {
cardLayout.show(contentPanel, panelName);
setTitle("Sistema ERP - " + panelName);
}

private void showDashboard() {
showPanel("Dashboard");
}

private void setupEventHandlers() {
addWindowListener(new WindowAdapter() {
    @Override
    public void windowClosing(WindowEvent e) {
        confirmExit();
    }
});
}

private void logout() {
int confirm = JOptionPane.showConfirmDialog(this,
    "¿Está seguro que desea cerrar sesión?",
    "Cerrar Sesión",
    JOptionPane.YES_NO_OPTION);
    
if (confirm == JOptionPane.YES_OPTION) {
    dispose();
    new LoginFrame().setVisible(true);
}
}

private void confirmExit() {
int confirm = JOptionPane.showConfirmDialog(this,
    "¿Está seguro que desea salir del sistema?",
    "Salir del Sistema",
    JOptionPane.YES_NO_OPTION);
    
if (confirm == JOptionPane.YES_OPTION) {
    System.exit(0);
}
}
}
6. Panel de Dashboard
DashboardPanel.java (~600 líneas)
java
package com.empresa.erp.gui;

import com.empresa.erp.model.Usuario;
import com.empresa.erp.service.DashboardService;

import javax.swing.*;
import java.awt.*;
import java.text.NumberFormat;

public class DashboardPanel extends JPanel {
private Usuario usuario;
private DashboardService dashboardService;

// Componentes de métricas
private JLabel lblTotalVentas;
private JLabel lblTotalClientes;
private JLabel lblTotalProductos;
private JLabel lblStockBajo;

public DashboardPanel(Usuario usuario) {
this.usuario = usuario;
this.dashboardService = new DashboardService();
initializeUI();
loadDashboardData();
}

private void initializeUI() {
setLayout(new BorderLayout());
setBackground(new Color(240, 240, 240));

// Panel de título
JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
titlePanel.setBackground(new Color(240, 240, 240));
titlePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

JLabel lblTitle = new JLabel("Dashboard Principal");
lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 24));
lblTitle.setForeground(new Color(60, 63, 65));
titlePanel.add(lblTitle);

add(titlePanel, BorderLayout.NORTH);

// Panel de contenido con scroll
JScrollPane scrollPane = new JScrollPane(createContentPanel());
scrollPane.setBorder(BorderFactory.createEmptyBorder());
scrollPane.getVerticalScrollBar().setUnitIncrement(16);
add(scrollPane, BorderLayout.CENTER);
}

private JPanel createContentPanel() {
JPanel contentPanel = new JPanel();
contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
contentPanel.setBackground(new Color(240, 240, 240));
contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

// Panel de métricas
contentPanel.add(createMetricsPanel());
contentPanel.add(Box.createVerticalStrut(20));

// Panel de gráficos
contentPanel.add(createChartsPanel());
contentPanel.add(Box.createVerticalStrut(20));

// Panel de actividades recientes
contentPanel.add(createRecentActivitiesPanel());

return contentPanel;
}

private JPanel createMetricsPanel() {
JPanel metricsPanel = new JPanel(new GridLayout(2, 2, 15, 15));
metricsPanel.setBackground(new Color(240, 240, 240));

// Métrica 1: Ventas del mes
JPanel ventasPanel = createMetricCard("Ventas del Mes", "$0.00", 
    new Color(41, 128, 185), "shopping-cart");

// Métrica 2: Total Clientes
JPanel clientesPanel = createMetricCard("Total Clientes", "0", 
    new Color(39, 174, 96), "users");

// Métrica 3: Total Productos
JPanel productosPanel = createMetricCard("Total Productos", "0", 
    new Color(142, 68, 173), "package");

// Métrica 4: Stock Bajo
JPanel stockPanel = createMetricCard("Stock Bajo", "0", 
    new Color(231, 76, 60), "alert-triangle");

metricsPanel.add(ventasPanel);
metricsPanel.add(clientesPanel);
metricsPanel.add(productosPanel);
metricsPanel.add(stockPanel);

// Referencias para actualización
lblTotalVentas = (JLabel) ((JPanel) ventasPanel.getComponent(1)).getComponent(0);
lblTotalClientes = (JLabel) ((JPanel) clientesPanel.getComponent(1)).getComponent(0);
lblTotalProductos = (JLabel) ((JPanel) productosPanel.getComponent(1)).getComponent(0);
lblStockBajo = (JLabel) ((JPanel) stockPanel.getComponent(1)).getComponent(0);

return metricsPanel;
}

private JPanel createMetricCard(String title, String value, Color color, String iconName) {
JPanel card = new JPanel();
card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
card.setBackground(Color.WHITE);
card.setBorder(BorderFactory.createCompoundBorder(
    BorderFactory.createLineBorder(new Color(200, 200, 200)),
    BorderFactory.createEmptyBorder(20, 20, 20, 20)
));
card.setPreferredSize(new Dimension(250, 120));

// Título
JLabel lblTitle = new JLabel(title);
lblTitle.setFont(new Font("Segoe UI", Font.PLAIN, 14));
lblTitle.setForeground(Color.GRAY);
lblTitle.setAlignmentX(Component.LEFT_ALIGNMENT);

// Valor
JLabel lblValue = new JLabel(value);
lblValue.setFont(new Font("Segoe UI", Font.BOLD, 28));
lblValue.setForeground(color);
lblValue.setAlignmentX(Component.LEFT_ALIGNMENT);

// Icono
JLabel lblIcon = new JLabel();
lblIcon.setAlignmentX(Component.LEFT_ALIGNMENT);
lblIcon.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));

try {
    FlatSVGIcon icon = new FlatSVGIcon("icons/" + iconName + ".svg", 24, 24);
    icon.setColorFilter(new FlatSVGIcon.ColorFilter(color -> color));
    lblIcon.setIcon(icon);
} catch (Exception e) {
    System.err.println("Error cargando icono métrica: " + e.getMessage());
}

card.add(lblTitle);
card.add(Box.createVerticalStrut(5));
card.add(lblValue);
card.add(lblIcon);

return card;
}

private JPanel createChartsPanel() {
JPanel chartsPanel = new JPanel(new GridLayout(1, 2, 15, 15));
chartsPanel.setBackground(new Color(240, 240, 240));

// Gráfico de ventas
JPanel salesChartPanel = createChartCard("Ventas Mensuales", 
    "Gráfico de ventas por mes", new Color(52, 152, 219));

// Gráfico de productos
JPanel productsChartPanel = createChartCard("Productos Más Vendidos", 
    "Top 10 productos", new Color(46, 204, 113));

chartsPanel.add(salesChartPanel);
chartsPanel.add(productsChartPanel);

return chartsPanel;
}

private JPanel createChartCard(String title, String description, Color color) {
JPanel card = new JPanel(new BorderLayout());
card.setBackground(Color.WHITE);
card.setBorder(BorderFactory.createCompoundBorder(
    BorderFactory.createLineBorder(new Color(200, 200, 200)),
    BorderFactory.createEmptyBorder(15, 15, 15, 15)
));
card.setPreferredSize(new Dimension(400, 300));

// Encabezado
JPanel headerPanel = new JPanel(new BorderLayout());
headerPanel.setBackground(Color.WHITE);

JLabel lblTitle = new JLabel(title);
lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 16));
lblTitle.setForeground(new Color(60, 63, 65));

JLabel lblDesc = new JLabel(description);
lblDesc.setFont(new Font("Segoe UI", Font.PLAIN, 12));
lblDesc.setForeground(Color.GRAY);

headerPanel.add(lblTitle, BorderLayout.NORTH);
headerPanel.add(lblDesc, BorderLayout.SOUTH);

// Contenido del gráfico (placeholder)
JPanel chartContent = new JPanel();
chartContent.setBackground(new Color(250, 250, 250));
chartContent.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));
chartContent.setPreferredSize(new Dimension(380, 220));

JLabel lblPlaceholder = new JLabel("Gráfico interactivo aquí", JLabel.CENTER);
lblPlaceholder.setForeground(Color.GRAY);
lblPlaceholder.setFont(new Font("Segoe UI", Font.ITALIC, 14));
chartContent.add(lblPlaceholder);

card.add(headerPanel, BorderLayout.NORTH);
card.add(chartContent, BorderLayout.CENTER);

return card;
}

private JPanel createRecentActivitiesPanel() {
JPanel activitiesPanel = new JPanel(new BorderLayout());
activitiesPanel.setBackground(Color.WHITE);
activitiesPanel.setBorder(BorderFactory.createCompoundBorder(
    BorderFactory.createLineBorder(new Color(200, 200, 200)),
    BorderFactory.createEmptyBorder(15, 15, 15, 15)
));

JLabel lblTitle = new JLabel("Actividades Recientes");
lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 16));
lblTitle.setForeground(new Color(60, 63, 65));

// Lista de actividades
String[] activities = {
    "Nueva venta registrada - Factura #001-001-0000001",
    "Cliente 'Juan Pérez' actualizado",
    "Producto 'Laptop Dell' bajo stock mínimo",
    "Usuario 'maria.garcia' creado",
    "Backup de base de datos completado"
};

JList<String> activitiesList = new JList<>(activities);
activitiesList.setBackground(Color.WHITE);
activitiesList.setFont(new Font("Segoe UI", Font.PLAIN, 12));
activitiesList.setEnabled(false);

JScrollPane scrollPane = new JScrollPane(activitiesList);
scrollPane.setPreferredSize(new Dimension(getWidth(), 120));

activitiesPanel.add(lblTitle, BorderLayout.NORTH);
activitiesPanel.add(scrollPane, BorderLayout.CENTER);

return activitiesPanel;
}

private void loadDashboardData() {
// Cargar datos en segundo plano
SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
    @Override
    protected Void doInBackground() throws Exception {
        // Simular carga de datos
        Thread.sleep(1000);
        return null;
    }
    
    @Override
    protected void done() {
        // Actualizar UI con datos reales
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        
        lblTotalVentas.setText(currencyFormat.format(12500.75));
        lblTotalClientes.setText("142");
        lblTotalProductos.setText("856");
        lblStockBajo.setText("12");
    }
};

worker.execute();
}
}
7. Servicios de Negocio
DashboardService.java (~200 líneas)
java
package com.empresa.erp.service;

import java.sql.*;
import java.util.*;
import com.empresa.erp.dao.DatabaseManager;

public class DashboardService {

public Map<String, Object> getDashboardStats() {
Map<String, Object> stats = new HashMap<>();

try (Connection conn = DatabaseManager.getInstance().getConnection()) {
    // Total ventas del mes
    stats.put("totalVentasMes", getTotalVentasMes(conn));
    
    // Total clientes
    stats.put("totalClientes", getTotalClientes(conn));
    
    // Total productos
    stats.put("totalProductos", getTotalProductos(conn));
    
    // Productos con stock bajo
    stats.put("stockBajo", getProductosStockBajo(conn));
    
    // Ventas por mes (últimos 6 meses)
    stats.put("ventasMensuales", getVentasMensuales(conn));
    
} catch (SQLException e) {
    e.printStackTrace();
}

return stats;
}

private double getTotalVentasMes(Connection conn) throws SQLException {
String sql = "SELECT COALESCE(SUM(total), 0) FROM ventas " +
            "WHERE MONTH(fecha_venta) = MONTH(CURRENT_DATE) " +
            "AND YEAR(fecha_venta) = YEAR(CURRENT_DATE) " +
            "AND estado = 'PAGADA'";

try (PreparedStatement pstmt = conn.prepareStatement(sql);
     ResultSet rs = pstmt.executeQuery()) {
    return rs.next() ? rs.getDouble(1) : 0;
}
}

private int getTotalClientes(Connection conn) throws SQLException {
String sql = "SELECT COUNT(*) FROM clientes WHERE estado = 'ACTIVO'";
try (PreparedStatement pstmt = conn.prepareStatement(sql);
     ResultSet rs = pstmt.executeQuery()) {
    return rs.next() ? rs.getInt(1) : 0;
}
}

private int getTotalProductos(Connection conn) throws SQLException {
String sql = "SELECT COUNT(*) FROM productos WHERE activo = TRUE";
try (PreparedStatement pstmt = conn.prepareStatement(sql);
     ResultSet rs = pstmt.executeQuery()) {
    return rs.next() ? rs.getInt(1) : 0;
}
}

private int getProductosStockBajo(Connection conn) throws SQLException {
String sql = "SELECT COUNT(*) FROM productos WHERE stock_actual <= stock_minimo AND activo = TRUE";
try (PreparedStatement pstmt = conn.prepareStatement(sql);
     ResultSet rs = pstmt.executeQuery()) {
    return rs.next() ? rs.getInt(1) : 0;
}
}

private Map<String, Double> getVentasMensuales(Connection conn) throws SQLException {
Map<String, Double> ventas = new LinkedHashMap<>();
String sql = "SELECT DATE_FORMAT(fecha_venta, '%Y-%m') as mes, SUM(total) as total " +
            "FROM ventas WHERE fecha_venta >= DATE_SUB(CURRENT_DATE, INTERVAL 6 MONTH) " +
            "AND estado = 'PAGADA' GROUP BY mes ORDER BY mes";

try (PreparedStatement pstmt = conn.prepareStatement(sql);
     ResultSet rs = pstmt.executeQuery()) {
    while (rs.next()) {
        ventas.put(rs.getString("mes"), rs.getDouble("total"));
    }
}
return ventas;
}
}
8. Utilidades
Configuracion.java (~250 líneas)
java
package com.empresa.erp.util;

import java.io.*;
import java.util.Properties;
import java.util.logging.Logger;

public class Configuracion {
private static Configuracion instance;
private Properties properties;
private static final Logger logger = Logger.getLogger(Configuracion.class.getName());
private static final String CONFIG_FILE = "config/application.properties";

private Configuracion() {
properties = new Properties();
loadConfiguration();
}

public static synchronized Configuracion getInstance() {
if (instance == null) {
    instance = new Configuracion();
}
return instance;
}

private void loadConfiguration() {
try {
    File configFile = new File(CONFIG_FILE);
    if (!configFile.exists()) {
        createDefaultConfiguration();
    }
    
    try (FileInputStream fis = new FileInputStream(configFile)) {
        properties.load(fis);
        logger.info("Configuración cargada desde: " + CONFIG_FILE);
    }
} catch (IOException e) {
    logger.warning("Error cargando configuración, usando valores por defecto: " + e.getMessage());
    setDefaultProperties();
}
}

private void createDefaultConfiguration() throws IOException {
File configDir = new File("config");
if (!configDir.exists()) {
    configDir.mkdirs();
}

setDefaultProperties();
saveConfiguration();
}

private void setDefaultProperties() {
properties.setProperty("database.url", "jdbc:mysql://localhost:3306/erp_system");
properties.setProperty("database.user", "root");
properties.setProperty("database.password", "");
properties.setProperty("application.name", "Sistema ERP");
properties.setProperty("application.version", "1.0.0");
properties.setProperty("ui.theme", "dark");
properties.setProperty("report.default.format", "PDF");
properties.setProperty("backup.enabled", "true");
properties.setProperty("backup.location", "backups/");
}

public void saveConfiguration() {
try (FileOutputStream fos = new FileOutputStream(CONFIG_FILE)) {
    properties.store(fos, "Configuración del Sistema ERP");
    logger.info("Configuración guardada en: " + CONFIG_FILE);
} catch (IOException e) {
    logger.severe("Error guardando configuración: " + e.getMessage());
}
}

public String getProperty(String key, String defaultValue) {
return properties.getProperty(key, defaultValue);
}

public String getProperty(String key) {
return properties.getProperty(key);
}

public void setProperty(String key, String value) {
properties.setProperty(key, value);
}

public int getIntProperty(String key, int defaultValue) {
try {
    return Integer.parseInt(properties.getProperty(key));
} catch (NumberFormatException e) {
    return defaultValue;
}
}

public boolean getBooleanProperty(String key, boolean defaultValue) {
String value = properties.getProperty(key);
return value != null ? Boolean.parseBoolean(value) : defaultValue;
}

public double getDoubleProperty(String key, double defaultValue) {
try {
    return Double.parseDouble(properties.getProperty(key));
} catch (NumberFormatException e) {
    return defaultValue;
}
}
}
9. Frame de Login
LoginFrame.java (~400 líneas)
java
package com.empresa.erp.gui;

import com.empresa.erp.model.Usuario;
import com.empresa.erp.security.AuthenticationService;
import com.formdev.flatlaf.extras.FlatSVGIcon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends JFrame {
private JTextField txtUsername;
private JPasswordField txtPassword;
private JButton btnLogin;
private JButton btnCancel;

public LoginFrame() {
initializeUI();
setupEventHandlers();
}

private void initializeUI() {
setTitle("Sistema ERP - Login");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setResizable(false);

// Panel principal
JPanel mainPanel = new JPanel(new BorderLayout());
mainPanel.setBackground(new Color(60, 63, 65));
mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

// Panel de logo
mainPanel.add(createLogoPanel(), BorderLayout.NORTH);

// Panel de formulario
mainPanel.add(createFormPanel(), BorderLayout.CENTER);

// Panel de botones
mainPanel.add(createButtonPanel(), BorderLayout.SOUTH);

add(mainPanel);
pack();
setLocationRelativeTo(null);
}

private JPanel createLogoPanel() {
JPanel logoPanel = new JPanel();
logoPanel.setBackground(new Color(60, 63, 65));
logoPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 30, 0));

JLabel lblLogo = new JLabel("SISTEMA ERP");
lblLogo.setFont(new Font("Segoe UI", Font.BOLD, 28));
lblLogo.setForeground(Color.WHITE);

JLabel lblSubtitle = new JLabel("Gestión Empresarial Integral");
lblSubtitle.setFont(new Font("Segoe UI", Font.PLAIN, 14));
lblSubtitle.setForeground(Color.LIGHT_GRAY);

logoPanel.setLayout(new BoxLayout(logoPanel, BoxLayout.Y_AXIS));
logoPanel.add(lblLogo);
logoPanel.add(Box.createVerticalStrut(5));
logoPanel.add(lblSubtitle);

return logoPanel;
}

private JPanel createFormPanel() {
JPanel formPanel = new JPanel();
formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));
formPanel.setBackground(new Color(60, 63, 65));
formPanel.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));

// Campo usuario
JPanel userPanel = new JPanel(new BorderLayout(10, 0));
userPanel.setBackground(new Color(60, 63, 65));
userPanel.setMaximumSize(new Dimension(300, 40));

JLabel lblUser = new JLabel("Usuario:");
lblUser.setForeground(Color.WHITE);
lblUser.setPreferredSize(new Dimension(80, 30));

txtUsername = new JTextField();
txtUsername.setPreferredSize(new Dimension(200, 35));
txtUsername.setBackground(new Color(45, 45, 48));
txtUsername.setForeground(Color.WHITE);
txtUsername.setCaretColor(Color.WHITE);
txtUsername.setBorder(BorderFactory.createCompoundBorder(
    BorderFactory.createLineBorder(new Color(100, 100, 100)),
    BorderFactory.createEmptyBorder(5, 10, 5, 10)
));

userPanel.add(lblUser, BorderLayout.WEST);
userPanel.add(txtUsername, BorderLayout.CENTER);

// Campo contraseña
JPanel passPanel = new JPanel(new BorderLayout(10, 0));
passPanel.setBackground(new Color(60, 63, 65));
passPanel.setMaximumSize(new Dimension(300, 40));

JLabel lblPass = new JLabel("Contraseña:");
lblPass.setForeground(Color.WHITE);
lblPass.setPreferredSize(new Dimension(80, 30));

txtPassword = new JPasswordField();
txtPassword.setPreferredSize(new Dimension(200, 35));
txtPassword.setBackground(new Color(45, 45, 48));
txtPassword.setForeground(Color.WHITE);
txtPassword.setCaretColor(Color.WHITE);
txtPassword.setBorder(BorderFactory.createCompoundBorder(
    BorderFactory.createLineBorder(new Color(100, 100, 100)),
    BorderFactory.createEmptyBorder(5, 10, 5, 10)
));

passPanel.add(lblPass, BorderLayout.WEST);
passPanel.add(txtPassword, BorderLayout.CENTER);

formPanel.add(userPanel);
formPanel.add(Box.createVerticalStrut(15));
formPanel.add(passPanel);

return formPanel;
}

private JPanel createButtonPanel() {
JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
buttonPanel.setBackground(new Color(60, 63, 65));

btnLogin = new JButton("Iniciar Sesión");
btnLogin.setPreferredSize(new Dimension(120, 35));
btnLogin.setBackground(new Color(0, 122, 204));
btnLogin.setForeground(Color.WHITE);
btnLogin.setFocusPainted(false);

btnCancel = new JButton("Salir");
btnCancel.setPreferredSize(new Dimension(120, 35));
btnCancel.setBackground(new Color(200, 60, 60));
btnCancel.setForeground(Color.WHITE);
btnCancel.setFocusPainted(false);

buttonPanel.add(btnLogin);
buttonPanel.add(btnCancel);

return buttonPanel;
}

private void setupEventHandlers() {
// Login al presionar Enter
ActionListener loginAction = e -> performLogin();
btnLogin.addActionListener(loginAction);
txtPassword.addActionListener(loginAction);

btnCancel.addActionListener(e -> System.exit(0));

// Focus traversal
txtUsername.addKeyListener(new KeyAdapter() {
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            txtPassword.requestFocus();
        }
    }
});
}

private void performLogin() {
String username = txtUsername.getText().trim();
String password = new String(txtPassword.getPassword());

if (username.isEmpty() || password.isEmpty()) {
    JOptionPane.showMessageDialog(this,
        "Por favor complete todos los campos",
        "Error de Validación",
        JOptionPane.WARNING_MESSAGE);
    return;
}

// Deshabilitar UI durante login
setEnabled(false);

SwingWorker<Usuario, Void> worker = new SwingWorker<Usuario, Void>() {
    @Override
    protected Usuario doInBackground() throws Exception {
        return AuthenticationService.getInstance().authenticate(username, password);
    }
    
    @Override
    protected void done() {
        setEnabled(true);
        try {
            Usuario usuario = get();
            if (usuario != null) {
                // Login exitoso
                dispose();
                new MainFrame(usuario).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(LoginFrame.this,
                    "Usuario o contraseña incorrectos",
                    "Error de Autenticación",
                    JOptionPane.ERROR_MESSAGE);
                txtPassword.setText("");
                txtPassword.requestFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(LoginFrame.this,
                "Error durante el login: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }
};

worker.execute();
}

@Override
public void setEnabled(boolean enabled) {
super.setEnabled(enabled);
txtUsername.setEnabled(enabled);
txtPassword.setEnabled(enabled);
btnLogin.setEnabled(enabled);
btnCancel.setEnabled(enabled);

if (enabled) {
    getGlassPane().setVisible(false);
} else {
    getGlassPane().setVisible(true);
}
}
}
10. Dependencias y Configuración
pom.xml (Maven)
xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
                     http://maven.apache.org/xsd/maven-4.0.0.xsd">
<modelVersion>4.0.0</modelVersion>

<groupId>com.empresa</groupId>
<artifactId>sistema-erp</artifactId>
<version>1.0.0</version>
<packaging>jar</packaging>

<properties>
<maven.compiler.source>11</maven.compiler.source>
<maven.compiler.target>11</maven.compiler.target>
<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
</properties>

<dependencies>
<!-- MySQL Connector -->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.33</version>
</dependency>

<!-- FlatLaf Look and Feel -->
<dependency>
    <groupId>com.formdev</groupId>
    <artifactId>flatlaf</artifactId>
    <version>3.2.1</version>
</dependency>

<!-- FlatLaf Extras (SVG Icons) -->
<dependency>
    <groupId>com.formdev</groupId>
    <artifactId>flatlaf-extras</artifactId>
    <version>3.2.1</version>
</dependency>

<!-- JFreeChart para gráficos -->
<dependency>
    <groupId>org.jfree</groupId>
    <artifactId>jfreechart</artifactId>
    <version>1.5.4</version>
</dependency>

<!-- iText para reportes PDF -->
<dependency>
    <groupId>com.itextpdf</groupId>
    <artifactId>itext7-core</artifactId>
    <version>7.2.5</version>
    <type>pom</type>
</dependency>

<!-- Apache Commons para utilidades -->
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-lang3</artifactId>
    <version>3.13.0</version>
</dependency>
</dependencies>

<build>
<plugins>
    <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.11.0</version>
        <configuration>
            <source>11</source>
            <target>11</target>
        </configuration>
    </plugin>
    
    <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-jar-plugin</artifactId>
        <version>3.3.0</version>
        <configuration>
            <archive>
                <manifest>
                    <mainClass>com.empresa.erp.main.Main</mainClass>
                </manifest>
            </archive>
        </configuration>
    </plugin>
</plugins>
</build>
</project>