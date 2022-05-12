import java.io.IOException;
import java.net.Socket;
import java.util.*;

public class Cliente {
	
	static Socket sockectCliente;
	static ConexaoServerCliente conexaoServerCliente;
	static int portaSocketCliente = 12347;
	
	Cliente() {
		try {
			sockectCliente = new Socket("localhost" , portaSocketCliente);
			
		}catch(Exception excp) {
			System.out.println(excp + this.getClass().getName());
		}
		
	}
	
	public static void main(String[] args) {

		System.out.println("");
		System.out.println("Bem vindo ao jogo ");

		System.out.println("| Escolha: |");
		System.out.println("1 - Papel");
		System.out.println("2 - Pedra");
		System.out.println("3 - Tesoura");

		Scanner cc = new Scanner(System.in);
		int cod = cc.nextInt();

		
		String requisicao = Integer.toString(cod);
		//String texto2 =  null;
		new Cliente();
		
		conexaoServerCliente.send(sockectCliente, requisicao);
	//	texto2 = conexaoServerCliente.receive(sockectCliente);
	
	}
	
	

}
