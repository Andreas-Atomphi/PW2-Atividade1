
public class ExercicioDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(possoIrAoBanco("S�bado", 15));
	}
	
	public static boolean possoIrAoBanco(String dia, int hora)
	{
		boolean dia_ativo = (dia != "S�bado" && dia !="Domingo");
		boolean hora_ativa = (hora > 8 && hora < 19);
		boolean posso_ir = (dia_ativo && hora_ativa);
		
		return posso_ir;
	}

}
