package PacoteJava;

import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		int carga,hora,minuto,segundo;
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com a carga hor�ria em segundos:");
		carga = ler.nextInt();
		hora = carga/3600;
		minuto = carga/60;
		segundo = carga;
		System.out.print("O tempo em horas �: ");
		System.out.println(hora);
		System.out.print("O tempo em minutos �: ");
		System.out.println(minuto);
		System.out.print("O tempo em segundos �: ");
		System.out.println(segundo);
		

	}

}
