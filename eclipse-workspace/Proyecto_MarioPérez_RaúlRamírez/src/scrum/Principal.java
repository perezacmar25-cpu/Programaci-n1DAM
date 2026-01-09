package scrum;
import utilidades.Leer;
import utilidades.Leer; 

import java.util.Random;

public class Principal {



    public static void main(String[] args) {
    	
    	
    	
    	//variables=Mario Pérez y Raúl Ramírez
    	//Menú=Mario Pérez los siete primeros if, Raúl Ramírez los siete segundos
    	//Ticket=Mario Pérez
    	//resto de cases=Raúl Ramírez


        int opcion;

        String[] registro;

        int edad;

        int catorce = 14;

        int dieciocho = 18;

        double notamedia;

        int ocho = 8;

        double saldo=0;

        double recarga=0;

        double descuento1 = 60;

        double cien = 100;

        double saldofinal=0;
        
        double descuento2 = 50;

        int treinta = 30;

        double descuento3 = 35;

        double descuento4 = 25;

        int cero = 0;

        int num;

        int desde = 1;

        int hasta = 1000;

        int cuatrocientos = 400;

        int seiscientos = 600;
        
        double dineroSumado=0;



        do {

            System.out.println("\n\t\t\t\t\t===============================================");

            System.out.println("\n\t\t\t\t\t\t\tVIAJE JOVEN 2025");

            System.out.println("\n\t\t\t\t\t===============================================");

            System.out.println("\n\nBienvenido a Viaje Joven. Este programa se encarga de hacer descuentos en tu tarjeta de transporte según tu nota media y la edad que tengas");

            System.out.println("\nPulsa 1 si eres estudiante");

            System.out.println("\nPulsa 2 si no eres estudiante");
            
            System.out.println("\nPulsa 0 si quiere acabar");

            opcion = Leer.datoInt();

            Random r = new Random(System.nanoTime());



            switch (opcion) {

                case 1:

                    registro = new String[9];

                    System.out.println("Regístrate");

                    System.out.println("\nNombre");

                    registro[0] = Leer.dato();

                    System.out.println("Apellidos");

                    registro[1] = Leer.dato();

                    System.out.println("DNI");

                    registro[2] = Leer.dato();

                    System.out.println("Código Postal");

                    registro[3] = Leer.dato();

                    System.out.println("Localidad");

                    registro[4] = Leer.dato();

                    System.out.println("Dirección");

                    registro[5] = Leer.dato();

                    System.out.println("Correo electrónico");

                    registro[6] = Leer.dato();

                    System.out.println("Número de teléfono");

                    registro[7] = Leer.dato();

                    System.out.println("Edad");

                    edad = Leer.datoInt();



                    if (edad > 30 || edad < 15) {

                        System.out.println("Este programa no es para ti. Lo sentimos mucho");

                    } else {

                        System.out.println("Otro servicio que se le ofrece en esta empresa es el de que según su nota media obtiene un descuento u otro");

                        System.out.println("\n¿Cuál es su nota media?");

                        notamedia = Leer.datoDouble();



                        if (notamedia < 5 || notamedia > 14) {

                            System.out.println("Error\n");

                        } else {

                            if (catorce < edad && edad <= dieciocho && notamedia > ocho) {

                                System.out.println("Con esa edad y esa nota media, se le va a aplicar un 60% a su recarga");

                                System.out.println("\n¿Cuánto dinero tienes en la tarjeta?");

                                saldo = Leer.datoDouble();

                                System.out.println("¿Cuánto dinero desea recargar?");

                                recarga = Leer.datoDouble();



                                if (recarga < cero) {

                                    System.out.println("Error");

                                } else {

                                    System.out.println("En nuestra empresa, tenemos el siguiente mecanismo: si en un rango de 1000 números, sale una cifra aleatoria entre 400 y 600, se le sumarán 5€ a su saldo final");

                                    num = r.nextInt(hasta - desde + 1) + desde;

                                    System.out.println("El número que ha salido es: " + num);



                                    if (num >= cuatrocientos && num <= seiscientos) {
                                    	
                                    	dineroSumado= recarga * descuento1 / cien;

                                        saldofinal = saldo + dineroSumado + recarga + 5;
                                        
                                       

                                        System.out.printf("Por lo tanto, su saldo se le quedaría en: %.2f€\n", saldofinal);

                                    } else {
                                    	
                                    	dineroSumado= recarga * descuento2 / cien;

                                        saldofinal = saldo + dineroSumado + recarga;
                                        
                                        

                                        System.out.printf("Entonces, cumpliendo esos requisitos, su saldo se quedaría en: %.2f €\n", saldofinal);

                                    }

                                }

                            }



                            if (catorce < edad && edad <= dieciocho && notamedia <= ocho) {

                                System.out.println("Con esa edad y esa nota media, se le va a aplicar un 50% a su recarga");

                                System.out.println("\n¿Cuánto dinero tienes en la tarjeta?");

                                saldo = Leer.datoDouble();

                                System.out.println("¿Cuánto dinero desea recargar?");

                                recarga = Leer.datoDouble();



                                if (recarga < cero) {

                                    System.out.println("Error");

                                } else {

                                    System.out.println("En nuestra empresa, tenemos el siguiente mecanismo: si en un rango de 1000 números, sale una cifra aleatoria entre 400 y 600, se le sumarán 5€ a su saldo final");

                                    num = r.nextInt(hasta - desde + 1) + desde;

                                    System.out.println("El número que ha salido es: " + num);



                                    if (num >= cuatrocientos && num <= seiscientos) {
                                    	
                                    	dineroSumado=recarga * descuento3 / cien;

                                        saldofinal = saldo + dineroSumado + recarga + 5;
                                        
                                        

                                        System.out.printf("Por lo tanto, su saldo se le quedaría en: %.2f€\n", saldofinal);

                                    }else {
                                    	
                                    	dineroSumado=recarga * descuento3 / cien;

                                    	saldofinal = saldo + dineroSumado + recarga;
                                    	
                                    	

                                        System.out.printf("Entonces, cumpliendo esos requisitos, su saldo se quedaría en: %.2f €\n", saldofinal);

                                    }



                                   

                                }

                            }



                            if (dieciocho < edad && edad <= treinta && notamedia >= ocho) {

                                System.out.println("Con esa edad y esa nota media, se le va a aplicar un 35% a su recarga");

                                System.out.println("\n¿Cuánto dinero tienes en la tarjeta?");

                                saldo = Leer.datoDouble();

                                System.out.println("¿Cuánto dinero desea recargar?");

                                recarga = Leer.datoDouble();



                                if (recarga < cero) {

                                    System.out.println("Error");

                                } else {

                                	 System.out.println("En nuestra empresa, tenemos el siguiente mecanismo: si en un rango de 1000 números, sale una cifra aleatoria entre 400 y 600, se le sumarán 5€ a su saldo final");

                                     num = r.nextInt(hasta - desde + 1) + desde;

                                     System.out.println("El número que ha salido es: " + num);

                                     if(num >= cuatrocientos && num <= seiscientos) {
                                    	 
                                    	 dineroSumado=recarga * descuento4 / cien;

                                    	 saldofinal = saldo + dineroSumado + recarga + 5;
                                    	 
                                    	 

                                         System.out.printf("Por lo tanto, su saldo se le quedaría en: %.2f€\n", saldofinal);

                                     }else {
                                    	 
                                    	 dineroSumado=recarga * descuento4 / cien;

                                    	 saldofinal = saldo + dineroSumado + recarga;
                                    	 
                                    	

                                         System.out.printf("Entonces, cumpliendo esos requisitos, su saldo se quedaría en: %.2f €\n", saldofinal);

                                     }

                                }

                            }



                            if (dieciocho < edad && edad <= treinta && notamedia < ocho) {

                                System.out.println("Con esa edad y esa nota media, se le va a aplicar un 25% a su recarga");

                                System.out.println("\n¿Cuánto dinero tienes en la tarjeta?");

                                saldo = Leer.datoDouble();

                                System.out.println("¿Cuánto dinero desea recargar?");

                                recarga = Leer.datoDouble();



                                if (recarga < cero) {

                                    System.out.println("Error");

                                } else {

                                	 System.out.println("En nuestra empresa, tenemos el siguiente mecanismo: si en un rango de 1000 números, sale una cifra aleatoria entre 400 y 600, se le sumarán 5€ a su saldo final");

                                     num = r.nextInt(hasta - desde + 1) + desde;

                                     System.out.println("El número que ha salido es: " + num);

                                     if(num >= cuatrocientos && num <= seiscientos) {

                                    	 saldofinal = saldo + (recarga * descuento2 / cien) + recarga + 5;
                                    	 
                                    	 dineroSumado=recarga * descuento2 / cien;

                                         System.out.printf("Por lo tanto, su saldo se le quedaría en: %.2f€\n", saldofinal);

                                     	

                                     }else {

                                    	 saldofinal = saldo + (recarga * descuento2 / cien) + recarga;
                                    	 
                                    	 dineroSumado=recarga * descuento2 / cien;

                                         System.out.printf("Entonces, cumpliendo esos requisitos, su saldo se quedaría en: %.2f €\n", saldofinal);

                                     }

                                     

                                }

                                

                            }

                        }

                    }
                    				System.out.println("\n\t\t\t\t\t-----------------------------------------------------");
                    				System.out.println("\n\t\t\t\t\t\t\t\tRECIBO");
                    				System.out.println("\n\t\t\t\t\t-----------------------------------------------------");
                    				System.out.println("\n\t\t\t\t\tNombre: "+registro[0]);
                    				System.out.println("\t\t\t\t\tApellidos: "+registro[1]);
                    				System.out.println("\t\t\t\t\tDNI: "+registro[2]);
                    				System.out.println("\t\t\t\t\tCódigo postal: "+registro[3]);
                    				System.out.println("\t\t\t\t\tLocalidad: "+registro[4]);
                    				System.out.println("\t\t\t\t\tDirección: "+registro[5]);
                    				System.out.println("\t\t\t\t\tCorreo electrónico: "+registro[6]);
                    				System.out.println("\t\t\t\t\tNúmero de teléfono: "+registro[7]);
                    				System.out.println("\t\t\t\t\tEdad: "+edad);
                    				System.out.println("\t\t\t\t\t\t\t\t\t\tSaldo inicial: "+saldo+"€");
                    				System.out.println("\t\t\t\t\t\t\t\t\t\tRecarga: "+recarga+"€");
                    				System.out.println("\t\t\t\t\t\t\t\t\t\tCantidad aplicada: "+dineroSumado+"€");
                    				System.out.println("\t\t\t\t\t\t\t\t\t\tSaldo final: "+saldofinal+"€");
                    				System.out.println("Muchas gracias por v");
                    				
                    				
                    				
                    				
                    break;



                case 2:

                    System.out.println("\nEste programa solo sirve para estudiantes, lo sentimos mucho.");

                    break;



                case 0:

                    System.out.println("Gracias por usar el programa, vuelva pronto");

                    break;



                default:

                    System.out.println("Error");

                    break;

            }
            
            
            
            	

        } while (opcion != 0);



    }

}