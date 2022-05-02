package jokenpo;

import java.io.*;
import java.net.Socket;

public class ConnectionServer {

	@SuppressWarnings("null")
	public static void send(Socket socketCliente, String jogada) {
		OutputStream out;

		try {
			out = socketCliente.getOutputStream();
			out.write(jogada.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("null")
	public static String receive(Socket socketCliente) {
		InputStream entrada = null;
		byte txtByte[] = new byte[1];
		String txt = "";

		try {
			entrada = socketCliente.getInputStream();
			entrada.read(txtByte);

			txt = new String(txtByte);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return txt;
	}
}
