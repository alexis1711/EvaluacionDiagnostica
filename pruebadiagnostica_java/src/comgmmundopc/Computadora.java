package comgmmundopc;

public class Computadora {
	private int idComputadora;
	private String nombre;
	private Monitor monitor;
	private Teclado teclado;
	private Raton raton;
	private static int contadorComputadoras = 1;
	
	public Computadora() {
		this.idComputadora = contadorComputadoras++;
		this.nombre = "";
		this.monitor = null;
		this.teclado = null;
		this.raton = null;
	}
	
	public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
		this.idComputadora = contadorComputadoras++;
		this.nombre = nombre;
		this.monitor = monitor;
		this.teclado = teclado;
		this.raton = raton;
	}
	
	public String toString() {
		return "*      Computadora      *"
				+ "\n* ID: " + this.idComputadora + "                 *" +
				"\n* Nombre: " + this.nombre +  
				"\n*        Monitor        *" + this.monitor.toString() +
				"\n*        Teclado        *" + this.teclado.toString() + 
				"\n*        Raton          *" + this.raton.toString();
		}

	public int getIdComputadora() {
		return idComputadora;
	}

	public void setIdComputadora(int idComputadora) {
		this.idComputadora = idComputadora;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Teclado getTeclado() {
		return teclado;
	}

	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	public Raton getRaton() {
		return raton;
	}

	public void setRaton(Raton raton) {
		this.raton = raton;
	}
}
