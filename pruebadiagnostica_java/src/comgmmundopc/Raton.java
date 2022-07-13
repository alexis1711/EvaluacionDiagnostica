package comgmmundopc;

public class Raton extends DispositivoEntrada{
	private int idRaton;
	private static int contadorRatones = 1;
	
	public Raton(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		this.idRaton = contadorRatones++;
	}
	
	public String toString() {
		return "\n* ID: " + this.idRaton + "                 *" +
				super.toString();
		}
}
