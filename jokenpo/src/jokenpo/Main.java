package jokenpo;

public class Main {
	static ServerClass serverClass;
	static JogadorClass jogadorClass;
	static ConnectionServer connectionServer;

	public static void main(String[] args) {
		jogadorClass = new JogadorClass();
		serverClass = new ServerClass();
		connectionServer = new ConnectionServer();

	}

}
