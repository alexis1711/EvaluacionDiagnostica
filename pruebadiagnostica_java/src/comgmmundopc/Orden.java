package comgmmundopc;

import java.util.ArrayList;
import java.util.List;

public class Orden {
	private int idOrden;
	private List<Computadora> computadoras = new ArrayList<>();
	private static int contadorOrdenes = 1;
	private static int contadorComputadoras = 0;
	private int maxComputadoras = 5;
	
	public Orden() {
		this.contadorComputadoras = 0;
		this.idOrden = contadorOrdenes++;
		//this.computadoras.clear();
	}
	
	public void agregarComputadora(Computadora computadora) {
		
		if(maxComputadoras == contadorComputadoras) {
			System.out.println("No se pueden agregar más articulos a su carrito... ");
		}
		else {
			contadorComputadoras++;
			computadoras.add(computadora);
		}
	}
	
	/*public double calcularTotal() {
		
	}*/
	
	public void mostrarOrden() {
		//this.computadoras.clear();
		System.out.println("*************************");
		System.out.println("*                       *");
		System.out.println("*       Orden n: " + this.idOrden + "      *");
		System.out.println("*                       *");
		System.out.println("*************************");
		System.out.println("*                       *");
		System.out.println("*       Detalles:       *");
		System.out.println("*                       *");
		System.out.println("* Total de productos: " + contadorComputadoras + " *");
		for(Computadora sr: computadoras) {
			System.out.println("*                       *");
			System.out.println("****                 ****");
			System.out.println("*                       *");
			System.out.println(sr.toString());
		}
		System.out.println("*                       *");
		System.out.println("*************************");
		System.out.println("*                       *");
		System.out.println("* Total:                *");
		System.out.println("*                       *");
		System.out.println("*************************");
	}
}
