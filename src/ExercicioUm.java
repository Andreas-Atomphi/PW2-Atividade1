
public class ExercicioUm {

	public static void main(String[] args) {
		
		System.out.println(ehDiaSemana("Sábado"));
		
	}
	
	public static boolean ehDiaSemana(String dia)
	{
		boolean edia = (dia == "Segunda" || dia == "Terça" || dia == "Quarta" || dia == "Quinta" || dia == "Sexta" || dia == "Sábado" || dia == "Domingo");
		return edia;
	}

}
