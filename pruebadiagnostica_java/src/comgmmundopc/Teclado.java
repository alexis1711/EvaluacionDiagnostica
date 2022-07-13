package comgmmundopc;

public class Teclado extends DispositivoEntrada{
	private int idTeclado;
	private static int contadorTeclados = 1;
	
	public Teclado(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		this.idTeclado = contadorTeclados++;
	}
	
	public String toString() {
		return "\n* ID: " + this.idTeclado + "                 *" +
				super.toString();
	}
}
