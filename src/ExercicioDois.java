
public class ExercicioDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(possoIrAoBanco("Sexta", 15));
	}
	
	public static boolean possoIrAoBanco(String dia, int hora)
	{
		final boolean dia_ativo = (dia != "Sábado" && dia !="Domingo");
		final boolean hora_ativa = (hora > 8 && hora < 19);
		final boolean posso_ir = (dia_ativo && hora_ativa && ehDiaSemana(dia));
		
		
		return posso_ir;
	}
	
	public static boolean ehDiaSemana(String dia)
	{
		boolean edia = (dia == "Segunda" || dia == "Terça" || dia == "Quarta" || dia == "Quinta" || dia == "Sexta" || dia == "Sábado" || dia == "Domingo");
		return edia;
	}

}