package testes;

import funcionamento.Sala;
import ui.Menu;

public class MenuTeste {

	public static void main(String[] args) {
		Menu m = new Menu();
		Sala s = new Sala();

		s.criaSala();

		System.out.println(s.getAssentos().length);

		m.exibeInicio();
		m.menu(s);
	}

}
