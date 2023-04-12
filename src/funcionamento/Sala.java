package funcionamento;

import java.util.Arrays;

public class Sala {

	private Assento[][] assentos;

	public Sala(Assento[][] assentos) {
		this.assentos = new Assento[7][12];
	}

	public Sala() {
		this.assentos = new Assento[7][12];
	}

	public Assento[][] getAssentos() {
		return assentos;
	}

	public void setSala(Assento[][] assentos) {
		this.assentos = assentos;
	}

	public void criaSala() {
		Assento[][] assentos = new Assento[7][12];
		for (int i = 0; i < assentos.length; i++) {
			for (int j = 0; j < assentos[i].length; j++) {
				assentos[i][j] = new Assento((char) (97 + i), j + 1);
			}
		}
		setSala(assentos);
	}

	@Override
	public String toString() {
		return "Sala [assentos=" + Arrays.toString(assentos) + "]";
	}
}
