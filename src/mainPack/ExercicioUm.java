package mainPack;

public class ExercicioUm {

	public static void main(String[] args) {
		
		System.out.println(ehDiaSemana("S�bado"));
		
	}
	
	public static boolean ehDiaSemana(String dia)
	{
		boolean edia = (dia.equalsIgnoreCase("segunda") || dia.equalsIgnoreCase("ter�a") || dia.equalsIgnoreCase("Quarta") || dia.equalsIgnoreCase("Quinta") || dia.equalsIgnoreCase("Sexta") || dia.equalsIgnoreCase("S�bado") || dia.equalsIgnoreCase("Domingo"));
		return edia;
	}

}