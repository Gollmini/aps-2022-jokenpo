package jokenpo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerClassMain {
	static Scanner scanner;
	static ServerSocket serverSocket;
	static Socket socketCliente;
	private final int PORTASOCKET = 1238;

	public ServerClassMain() {
		super();
		initSocket();

	}

	public void initSocket() {
		try {
			serverSocket = new ServerSocket(PORTASOCKET);
			System.out.println("Socket criado com sucesso " + PORTASOCKET);
		} catch (IOException e) {
			System.out.println("Erro ao criar o Socket");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		ServerClassMain serverClassMain = new ServerClassMain();
	}

}
