
public class Simbolos {
	
	int papel = 1;
	int pedra = 2;
	int tesoura = 3;

	public String converteSimbolo(int codigo){
		if (codigo == 1 ){
			return "Papel";
		}else if(codigo == 2){
			return "Pedra";
		}else{
			return "Tesoura";
		}
	}

}
