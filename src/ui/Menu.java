package ui;

import funcionamento.Opcoes;
import funcionamento.Sala;
import funcionamento.Teclado;

public class Menu {

	public void menu(Sala s) {
		exibeOpcoesMenu();
		System.out.println();
		int escolha = Teclado.leInt("Escolha uma opção: ");

		switch (escolha) {
		case 1:
			Opcoes.mostrarMapa(s);
			Opcoes.reservar(s.getAssentos());
			voltarAoMenu(s);
			break;
		
		case 2:
			Opcoes.mostrarMapa(s);
			Opcoes.cancelarReserva(s.getAssentos());
			voltarAoMenu(s);
			break;

		case 3:
			Opcoes.mostrarMapa(s);
			voltarAoMenu(s);
			break;
			
		case 4:
			Opcoes.mostrarAssentosReservados(s.getAssentos());
			voltarAoMenu(s);
			break;

		case 9:
			espacoConsole(3);
			System.out.println("\nSaindo do menu... Te vejo outra hora!");
			break;

		default:
			voltarAoMenu(s);
			break;
		}
	}

	public void exibeInicio() {
		escritaInicial();
		limparConsole();
	}

	public void voltarAoMenu(Sala s) {
		Menu.espacoConsole(2);
		char voltar = Teclado.leChar("\nDeseja voltar ao menu? (S/N)");
		while (true) {
			if (voltar == 'S' || voltar == 's') {
				limparConsole();
				menu(s);
				break;
			}

			else if (voltar == 'N' || voltar == 'n') {
				espacoConsole(3);
				System.out.println("Ok! Te vemos em breve em nosso cinema!\nSaindo...");
				System.exit(0);
			}

			else {
				espacoConsole(5);
				System.out.println("Escolha uma opção válida!");
				voltar = Teclado.leChar("\nDeseja voltar ao menu? (S/N)");
			}
		}
	}

	public void escritaInicial() {
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+");
		System.out.println(
				"|                                                                                                                                |                                                                  |");
		System.out.println(
				"|             CCCCCCCCCCCCC    iiii                                                                                              |                                                                  |");
		System.out.println(
				"|          CCC::::::::::::C   i::::i                                                                                             |                                                                  |");
		System.out.println(
				"|        CC:::::::::::::::C    iiii                                                                                              |                                                                  |");
		System.out.println(
				"|       C:::::CCCCCCCC::::C                                                                                                      |                                                                  |");
		System.out.println(
				"|      C:::::C       CCCCCC  iiiiiii   nnnn  nnnnnnnn          eeeeeeeeeeee         mmmmmmm    mmmmmmm       aaaaaaaaaaaaa       |      ___                 _                                       |");
		System.out.println(
				"|     C:::::C                i:::::i   n:::nn::::::::nn      ee::::::::::::ee     mm:::::::m  m:::::::mm     a::::::::::::a      |     (  _`\\              ( )_                                     |");
		System.out.println(
				"|     C:::::C                 i::::i   n::::::::::::::nn    e::::::eeeee:::::ee  m::::::::::mm::::::::::m    aaaaaaaaa:::::a     |     | ( (_) _   _   ___ | ,_)   _ _  _   _    _         __       |");
		System.out.println(
				"|     C:::::C                 i::::i   nn:::::::::::::::n  e::::::e     e:::::e  m::::::::::::::::::::::m             a::::a     =     | |___ ( ) ( )/',__)| |   /'_` )( ) ( ) /'_`\\     /'__`\\     |");
		System.out.println(
				"|     C:::::C                 i::::i     n:::::nnnn:::::n  e:::::::eeeee::::::e  m:::::mmm::::::mmm:::::m      aaaaaaa:::::a           | (_, )| (_) |\\__, \\| |_ ( (_| || \\_/ |( (_) )   (  ___/     |");
		System.out.println(
				"|     C:::::C                 i::::i     n::::n    n::::n  e:::::::::::::::::e   m::::m   m::::m   m::::m    aa::::::::::::a     =     (____/'`\\___/'(____/`\\__)`\\__,_)`\\___/'`\\___/'   `\\____)     |");
		System.out.println(
				"|     C:::::C                 i::::i     n::::n    n::::n  e::::::eeeeeeeeeee    m::::m   m::::m   m::::m   a::::aaaa::::::a     |                    _    _                                        |");
		System.out.println(
				"|      C:::::C       CCCCCC   i::::i     n::::n    n::::n  e:::::::e             m::::m   m::::m   m::::m  a::::a    a:::::a     |     /'\\_/`\\       ( )_ ( )                                       |");
		System.out.println(
				"|       C:::::CCCCCCCC::::C  i::::::i    n::::n    n::::n  e::::::::e            m::::m   m::::m   m::::m  a::::a    a:::::a     |     |     |   _ _ | ,_)| |__     __   _   _   ___                |");
		System.out.println(
				"|        CC:::::::::::::::C  i::::::i    n::::n    n::::n   e::::::::eeeeeeee    m::::m   m::::m   m::::m  a:::::aaaa::::::a     |     | (_) | /'_` )| |  |  _ `\\ /'__`\\( ) ( )/',__)               |");
		System.out.println(
				"|          CCC::::::::::::C  i::::::i    n::::n    n::::n    ee:::::::::::::e    m::::m   m::::m   m::::m   a::::::::::aa:::a    |     | | | |( (_| || |_ | | | |(  ___/| (_) |\\__, \\               |");
		System.out.println(
				"|             CCCCCCCCCCCCC  iiiiiiii    nnnnnn    nnnnnn      eeeeeeeeeeeeee    mmmmmm   mmmmmm   mmmmmm    aaaaaaaaaa  aaaa    |     (_) (_)`\\__,_)`\\__)(_) (_)`\\____)`\\___/'(____/               |");
		System.out.println(
				"|                                                                                                                                |                                                                  |");
		System.out.println(
				"+---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+");
		System.out.println();
		loading();
	}

	public void exibeOpcoesMenu() {
		System.out.println("+----------------------------------+");
		System.out.println("|               Menu               |");
		System.out.println("+----------------------------------+");
		System.out.println("|                                  |");
		System.out.println("| 1- Reservar poltrona             |");
		System.out.println("| 2- Cancelar reserva              |");
		System.out.println("| 3- Mostrar mapa da sessão        |");
		System.out.println("| 4- Verificar pedido              |");
		System.out.println("|                                  |");
		System.out.println("| 9- Sair do menu                  |");
		System.out.println("|                                  |");
		System.out.println("+----------------------------------+");
	}

	public static void mostrarMapaSala(Sala s) {
		System.out.println("  +----------------------------------- Mapa da sessão -----------------------------------+");
		System.out
				.println("  |                                                                                      |");
		for (int i = 0; i < s.getAssentos().length; i++) {
			for (int j = 0; j < s.getAssentos()[i].length; j++) {
				
				String idAssentoModificado = null;
				
				if(s.getAssentos()[i][j].isOcupado())
					idAssentoModificado = new String(new char[s.getAssentos()[i][j].getId().length()]).replace("\0", "X");
				else
					idAssentoModificado = s.getAssentos()[i][j].getId();
				
				
				System.out.print("  |  " + idAssentoModificado);
				if (j == 11) {
					System.out.print("  |\n");
					System.out.println("  |                                                                                      |");
				}
			}
		}
		System.out.println("  +--------------------------------------------------------------------------------------+");
	}

	public void loading() {
		char[] c = new char[] { '#', '=' };
		System.out.println("Carregando menu: ");
		for (int i = 0; i <= 196; i++) {
			System.out.print(c[i % 2]);
			sleep(15);
		}
		System.out.println("\nPronto!");
		sleep(1200);
	}

	public static void limparConsole() {
		for (int i = 0; i < 50; ++i)
			System.out.println();
	}

	public static void espacoConsole(int e) {
		for (int i = 0; i < e; ++i)
			System.out.println();
	}

	public static void sleep(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}