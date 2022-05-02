package jokenpo;

import java.net.Socket;

public class ClienteClass {

	static Socket sockectCliente;
	static int portaSocketCliente = 12348;

	ClienteClass() {
		try {
			sockectCliente = new Socket("localhost", portaSocketCliente = +1);
			System.out.println("Cliente conectado atraves da porta: " + portaSocketCliente);

		} catch (Exception excp) {
			System.out.println(excp + this.getClass().getName());
		}
	}

	public static void main(String[] args) {

		String requisicao = "1";
		new ClienteClass();

		ConnectionServer.send(sockectCliente, requisicao);
		ConnectionServer.receive(sockectCliente);
	}
}
