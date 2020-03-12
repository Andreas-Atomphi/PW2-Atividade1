package mainPack;

import mainPack.ExercicioUm;

public class ExercicioDois {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(possoIrAoBanco("Sexta", 15));
	}
	
	public static boolean possoIrAoBanco(String dia, int hora)
	{
		final boolean dia_ativo = !(dia.equalsIgnoreCase("Sábado") && dia.equalsIgnoreCase("Domingo"));
		final boolean hora_ativa = (hora > 9 && hora < 17);
		final boolean posso_ir = (dia_ativo && hora_ativa && ExercicioUm.ehDiaSemana(dia));
		
		
		return posso_ir;
	}

}