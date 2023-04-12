package funcionamento;

import ui.Menu;

public class Opcoes {

	public static Assento[] reservaArmazenada(Assento[][] assentos) {
		Assento[] arrayAssentos = new Assento[assentos.length * assentos[0].length];
		int count = 0;

		for (int i = 0; i < assentos.length; i++) {
			for (int j = 0; j < assentos[i].length; j++) {
				arrayAssentos[count] = assentos[i][j];
				count++;
			}
		}
		return arrayAssentos;
	}

	public static void reservar(Assento[][] assentos) {
		Menu.espacoConsole(2);
		int quant = Teclado.leInt("Quantos assentos você deseja reservar? ");
		Menu.espacoConsole(2);
		int k = 0;

		while (k < quant) {
			String assentoId = Teclado.leString("Escolha um assento: ");
			boolean encontrado = false;

			for (int i = 0; i < assentos.length; i++) {
				for (int j = 0; j < assentos[i].length; j++) {
					if (assentoId.equalsIgnoreCase(assentos[i][j].getId())) {
						encontrado = true;
						if (assentos[i][j].isOcupado()) {
							Menu.espacoConsole(2);
							System.out.println(
									"O assento " + assentoId + " já está ocupado. Por favor, escolha outro assento.");
						} else {
							assentos[i][j].setOcupado(true);
							k++;
							reservaArmazenada(assentos);
							Menu.espacoConsole(2);
							System.out.println("O assento " + assentoId + " foi reservado.");
						}
						break;
					}
				}

				if (encontrado) {
					break;
				}
			}

			if (!encontrado) {
				Menu.espacoConsole(2);
				System.out.println("O assento " + assentoId + " não foi encontrado. Por favor, escolha outro assento.");
			}
		}
	}

	public static void cancelarReserva(Assento[][] assentos) {
		Menu.espacoConsole(2);
		int quant = Teclado.leInt("Quantos assentos você deseja cancelar? ");
		Menu.espacoConsole(2);
		int k = 0;

		int conta = 0;

		for (int i = 0; i < reservaArmazenada(assentos).length; i++) {
			if (reservaArmazenada(assentos)[i].isOcupado())
				conta++;
		}

		while (quant > conta) {
			Menu.espacoConsole(2);
			System.out.println(
					"Não é possível cancelar " + quant + " assentos, pois você apenas reservou " + conta + " assentos");
			quant = Teclado.leInt("Escolha uma quantidade válida ou digite 9 para voltar ao menu: ");
			if (quant == 9)
				return;
		}

		while (k < quant) {

			String assentoId = Teclado.leString("Escolha um assento: ");
			boolean encontrado = false;

			for (int i = 0; i < reservaArmazenada(assentos).length; i++) {
				if (assentoId.equalsIgnoreCase(reservaArmazenada(assentos)[i].getId())) {
					encontrado = true;

					if (reservaArmazenada(assentos)[i].isOcupado() == false) {
						Menu.espacoConsole(2);
						System.out.println("O assento " + assentoId
								+ " está livre, ou seja, não foi reservado. Por favor, escolha outro assento para cancelar.");

					} else {
						reservaArmazenada(assentos)[i].setOcupado(false);
						k++;
						Menu.espacoConsole(2);
						System.out.println("O assento " + assentoId + " foi cancelado.");
					}
					break;

				}
				if (encontrado) {
					break;
				}
			}

			if (!encontrado) {
				Menu.espacoConsole(2);
				System.out.println("O assento " + assentoId + " não foi encontrado. Por favor, escolha outro assento.");
			}
		}
	}

	public static void mostrarMapa(Sala s) {
		Menu.limparConsole();
		Menu.mostrarMapaSala(s);
	}

	public static void mostrarAssentosReservados(Assento[][] assentos) {
		Menu.limparConsole();
		int conta = 0;

		for (int i = 0; i < reservaArmazenada(assentos).length; i++) {
			if (reservaArmazenada(assentos)[i].isOcupado())
				conta++;
		}

		System.out.println("Foram reservados " + conta + " assentos.");
		System.out.print("Assentos reservados: [  ");
		for (int i = 0; i < reservaArmazenada(assentos).length; i++) {
			if (reservaArmazenada(assentos)[i].isOcupado()) {
				System.out.print(reservaArmazenada(assentos)[i].getId() + "  ");
			}
		}
		System.out.print("]");
	}
}
