import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.net.*;

public class Servidor {
	static ServerSocket serverSocket;
	static Socket socketCliente;


	static ConexaoServerCliente conexaoServerCliente;

	SinglePlayerMode singlePlayerMode;
	MultiplayerMode multiplayerMode;
	Simbolos simbolos = new Simbolos();
	Scanner scanner;
	Random random;


	int calculo;

	public Servidor() throws IOException {
		super();
		singlePlayerMode = new SinglePlayerMode();
		multiplayerMode = new MultiplayerMode();
		scanner = new Scanner(System.in);
		random = new Random();

		serverSocket = new ServerSocket(12347);

	}

	// metodo coberter simboolo serve para mostrar o nome da jogada de acordo o codigo digitado;
	// a jogada do computador é gerada aleatoriamente pelo random

	public void resultadoJogada(int jogadaJogador1) {
		
		Jogador jogador2 = new Jogador();
		jogador2.setJogada(random.nextInt(2) + 1);
		
		//as jogasdastem um valor de acordo com o codigo: papel = 1, pedra = 2 etesoura = 3 para fazer o calculo
		calculo = jogadaJogador1 - jogador2.getJogada();
		System.out.println("");
		
		System.out.println("Jogador 1 jogou: " + simbolos.converteSimbolo(jogadaJogador1));
		System.out.println("");
		
		System.out.println("Computador jogou: " + simbolos.converteSimbolo(jogador2.getJogada()));
		System.out.println("");
		
		System.out.println("");
		System.out.println("****** R E S U L T A D O ******");
		System.out.println("");

		if (calculo == 0) {
			System.out.println("Empate");
		} else if (calculo == 2 || calculo == -1) {
			System.out.println("Jogador Ganhou");
		} else {
			System.out.println("Computador Ganhou");
		}
	}

	public static void main(String[] args) throws IOException {
		Servidor server = new Servidor();
		socketCliente = serverSocket.accept();
		System.out.println("Cliente conectado");

		String jogadaCliente;
		jogadaCliente = ConexaoServerCliente.receive(socketCliente);

		
		int numero = Integer.parseInt(jogadaCliente);
		server.resultadoJogada(numero);
		
	//	serverSocket.close();

	}

}
