package main;

import funcionamento.Sala;
import ui.Menu;

public class Main {
	public static void main(String[] args) {
		Menu m = new Menu();
		Sala s = new Sala();

		s.criaSala();

		m.exibeInicio();
		m.menu(s);
	}
}
