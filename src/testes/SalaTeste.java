package testes;

import funcionamento.Opcoes;
import funcionamento.Sala;

public class SalaTeste {
	public static void main(String[] args) {

		Sala s = new Sala();

		s.criaSala();

		Opcoes.mostrarMapa(s);
	}
}
