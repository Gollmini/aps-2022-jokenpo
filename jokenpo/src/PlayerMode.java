import java.util.Scanner;

public class PlayerMode {
	Scanner scanner;
	Simbolos simbolos;

	public PlayerMode() {
		scanner = new Scanner(System.in);
		simbolos = new Simbolos();
	}

	void jogar() {

		System.out.println("");
		System.out.println("Bem vindo ao modo ");

		System.out.println("| Escolha: |");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
	//	jogador1.setJogada(scanner.nextInt());

		//System.out.println("Jogador 1 escolheu: " + jogador1.getJogada());
		//System.out.println("Jogador 2 escolheu: " + jogador2.getJogada());

	}
}
