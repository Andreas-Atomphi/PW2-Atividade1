
public class ExercicioUm {

	public static void main(String[] args) {
		
		System.out.println(ehDiaSemana("S�bado"));
		
	}
	
	public static boolean ehDiaSemana(String dia)
	{
		boolean edia = (dia == "Segunda" || dia == "Ter�a" || dia == "Quarta" || dia == "Quinta" || dia == "Sexta" || dia == "S�bado" || dia == "Domingo");
		return edia;
	}

}
