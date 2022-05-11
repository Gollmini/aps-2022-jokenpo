import java.io.IOException;
import java.net.Socket;

public class Cliente {
	
	static Socket sockectCliente;
	static ConexaoServerCliente conexaoServerCliente;
	
	Cliente() {
		try {
			sockectCliente = new Socket("localhost" , 12348);
			
		}catch(Exception excp) {
			System.out.println(excp + this.getClass().getName());
		}
		
	}
	
	public static void main(String[] args) {
		
		String requisicao = "1";
		String texto2;
		new Cliente();
		
		conexaoServerCliente.send(sockectCliente, requisicao);
		texto2 = conexaoServerCliente.receive(sockectCliente);
	/*	try {
		//	sockectCliente.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}
	
	

}
