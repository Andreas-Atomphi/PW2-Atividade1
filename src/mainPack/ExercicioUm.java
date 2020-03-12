package mainPack;

public class ExercicioUm {

	public static void main(String[] args) {
		
		System.out.println(ehDiaSemana("Sábado"));
		
	}
	
	public static boolean ehDiaSemana(String dia)
	{
		boolean edia = (dia.equalsIgnoreCase("segunda") || dia.equalsIgnoreCase("terça") || dia.equalsIgnoreCase("Quarta") || dia.equalsIgnoreCase("Quinta") || dia.equalsIgnoreCase("Sexta") || dia.equalsIgnoreCase("Sábado") || dia.equalsIgnoreCase("Domingo"));
		return edia;
	}

}