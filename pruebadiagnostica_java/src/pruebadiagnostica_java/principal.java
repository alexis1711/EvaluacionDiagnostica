package pruebadiagnostica_java;

import comgmmundopc.Computadora;
import comgmmundopc.Monitor;
import comgmmundopc.Orden;
import comgmmundopc.Raton;
import comgmmundopc.Teclado;

public class principal {

	public static void main(String[] args) {
		
		Raton raton1 = new Raton("USB", "HP");
		Teclado teclado1 = new Teclado("Inalambrico", "DELL");
		Monitor monitor1 = new Monitor("LG", 23.5);
		Computadora computadora1 = new Computadora("La potente", monitor1, teclado1, raton1);
		
		Raton raton2 = new Raton("Inalambrico", "Lenovo");
		Teclado teclado2 = new Teclado("USB", "HP");
		Monitor monitor2 = new Monitor("AOC", 21.3);
		Computadora computadora2 = new Computadora("La nueva", monitor2, teclado2, raton2);
		
		Raton raton3 = new Raton("Tipo C", "Lenovo");
		Teclado teclado3 = new Teclado("Inalambrico", "HP");
		Monitor monitor3 = new Monitor("Samsung", 22);
		Computadora computadora3 = new Computadora("La fuerte", monitor3, teclado3, raton3);
		
		Raton raton4 = new Raton("Inalambrico", "klip");
		Teclado teclado4 = new Teclado("USB", "klip");
		Monitor monitor4 = new Monitor("LG", 24);
		Computadora computadora4 = new Computadora("La duradera", monitor4, teclado4, raton4);
		
		Raton raton5 = new Raton("Tipo C", "Lenovo");
		Teclado teclado5 = new Teclado("Inalambrico", "HP");
		Monitor monitor5 = new Monitor("DELL", 20);
		Computadora computadora5 = new Computadora("La de cristal", monitor5, teclado1, raton2);
		
		Raton raton6 = new Raton("Bluetooth", "Lenovo");
		Teclado teclado6 = new Teclado("USB", "HP");
		Monitor monitor6 = new Monitor("AOC", 21.3);
		Computadora computadora6 = new Computadora("La metalica", monitor6, teclado6, raton6);
		
		
		Orden orden1 = new Orden();
		orden1.agregarComputadora(computadora1);
		orden1.agregarComputadora(computadora2);
		orden1.agregarComputadora(computadora3);
		orden1.agregarComputadora(computadora4);
		orden1.agregarComputadora(computadora5);
		orden1.agregarComputadora(computadora6);
		
		orden1.mostrarOrden();

		
		Orden orden2 = new Orden();
		orden2.agregarComputadora(computadora6);
		orden2.agregarComputadora(computadora3);
		orden2.agregarComputadora(computadora1);
		orden2.agregarComputadora(computadora4);
		orden2.agregarComputadora(computadora2);
		orden2.agregarComputadora(computadora5);
		
		orden2.mostrarOrden();
		
		Orden orden3 = new Orden();
		orden3.agregarComputadora(computadora2);
		orden3.agregarComputadora(computadora5);
		orden3.agregarComputadora(computadora3);
		orden3.agregarComputadora(computadora1);
		orden3.agregarComputadora(computadora4);
		orden3.agregarComputadora(computadora3);
		
		orden3.mostrarOrden();

	}

}
