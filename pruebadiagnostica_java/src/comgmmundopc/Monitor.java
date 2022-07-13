package comgmmundopc;

public class Monitor {
	private int idMonitor;
	private String marca;
	private double tamaño;
	private static int contadorMonitores = 1;
	
	public Monitor() {
		this.idMonitor = contadorMonitores++;
		this.marca = "";
		this.tamaño = 0;
	}
	public Monitor(String marca, double tamaño) {
		this.idMonitor = contadorMonitores++;
		this.marca = marca;
		this.tamaño = tamaño;
	}
	
	public String toString() {
		return "\n* ID: " + this.idMonitor + "                 *" +
				"\n* Marca: " + this.marca + "            *" +
				"\n* Tamaño: " + this.tamaño + "          *"; 
	}
	public int getIdMonitor() {
		return idMonitor;
	}
	public void setIdMonitor(int idMonitor) {
		this.idMonitor = idMonitor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getTamaño() {
		return tamaño;
	}
	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}
}
