package funcionamento;

public class Assento {

	private int numero;
	private char letra;
	private boolean ocupado;

	public Assento(char letra, int numero) {
		this.letra = letra;
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public char getLetra() {
		return letra;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public boolean isOcupado() {
		return this.ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public String getId() {
		return String.valueOf(getLetra()).toUpperCase() + getNumero();
	}
}
