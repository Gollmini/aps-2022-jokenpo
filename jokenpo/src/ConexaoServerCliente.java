import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ConexaoServerCliente {

	@SuppressWarnings("null")
	public static void send(Socket socketCliente, String jogada) {
		OutputStream out;

		try {
			out = socketCliente.getOutputStream();
			out.write(jogada.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@SuppressWarnings("null")
	public static String receive(Socket socketCliente) {
		InputStream entrada = null;
		byte txtByte[] = new byte[1];
		String txt = "";
		int bt;

		try {
			entrada = socketCliente.getInputStream();
			bt = entrada.read(txtByte);

			txt = new String(txtByte);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return txt;
	}

}
