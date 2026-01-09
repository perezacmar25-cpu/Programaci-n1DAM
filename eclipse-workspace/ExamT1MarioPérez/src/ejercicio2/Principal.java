package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nocheshotel;
		double precioinicialhotel;
		double preciopornoche=120;
		double preciofinalhotel;
		double descuento;
		double cuatro=4;
		double cien=100;
		double comida=420;
		int repuestogasolina;
		double preciogasolina=30;
		double visitas=31.50;
		double gastototal;
		double iva=21;
		double precioconiva;
		double preciofinal;
		int cero=0;
		double preciototalgasolina;
		double entrega=1500;
		double devolucion;
		double saldobanco=1500;
		int milquinientos=1500;
		
		System.out.println("Este programa calcula el total de gastos de sus vacaciones");
		System.out.println("\n\n¿Cuántas noches ha estado en el hotel?");
		
		nocheshotel=Leer.datoInt();
		
		
		precioinicialhotel=nocheshotel*preciopornoche;
		
		descuento=(precioinicialhotel*cuatro)/cien;
		
		preciofinalhotel=precioinicialhotel-descuento;
		
		System.out.printf("Por lo tanto, el hotel le ha costado:%.2f ",preciofinalhotel);
		
		
		System.out.println("\n\nPara seguir calculando sus gastos, se necesita saber cuántas veces recargaste gasolina");
		
		repuestogasolina=Leer.datoInt();
		
		preciototalgasolina=repuestogasolina*preciogasolina;
		
		gastototal=comida+preciototalgasolina+visitas+preciofinalhotel;
		
		precioconiva=(gastototal*iva)/cien;
		
		preciofinal=gastototal+precioconiva;
		
		devolucion=entrega-preciofinal;
		
		saldobanco=milquinientos-preciofinal;
		
		System.out.printf("Por lo tanto, durante todo el viaje, usted se ha gastado un total de: %.2f ",gastototal);
		
		System.out.printf("\n\nUna vez que tengamos el gasto total, hay que sumarle el 21%% de IVA, lo que se quedaría en:%.2f ",preciofinal);
		
		
		
		
		
		System.out.println("\n\n\n\t\t\t\t\t\tTICKET FINAL");
		System.out.println("**********************************************************************************************************************************************************************************************");
		System.out.println("HOTEL\t\t\t PRECIO/CANTIDAD\t\t\tCANTIDAD\t\t\t\tDESCUENTO\t\t\t\t\tSUBTOTAL");
		System.out.printf("\t\t\t%.2f\t\t\t\t\t%d\t\t\t\t\t%.2f\t\t\t\t\t\t%.2f",preciopornoche,nocheshotel,descuento,preciofinalhotel);
		System.out.println("\n\nCOMIDA");
		System.out.printf("\t\t\t-\t\t\t\t\t-\t\t\t\t\t%s\t\t\t\t\t\t%.2f",cero,comida);
		System.out.println("\n\nGASOLINA");
		System.out.printf("\t\t\t%.2f\t\t\t\t\t%s\t\t\t\t\t%d\t\t\t\t\t\t%.2f",preciogasolina,repuestogasolina,cero,preciototalgasolina);
		System.out.println("\n\n\nVISITAS");
		System.out.printf("\t\t\t-\t\t\t\t\t-\t\t\t\t\t%d\t\t\t\t\t\t%.2f",cero,visitas);
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tTOTAL:%.2f",gastototal);
		System.out.printf("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tTOTAL IVA INCLUIDO:%.2f",preciofinal);
		System.out.printf("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tTOTAL ENTREGADO:%.2f",entrega);
		System.out.printf("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tDEVOLUCIÓN:%.2f",devolucion);
		System.out.printf("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSi tenía 1500 euros en el banco, le quedaría un total de:%.2f ",saldobanco);
		
	}

}
