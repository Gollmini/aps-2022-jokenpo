package jokenpo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerClass {
	static Scanner scanner;
	static ServerSocket serverSocket;
	static Socket socketCliente;
	private final int PORTASOCKET = 1238;

	public ServerClass() {
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

	

}
