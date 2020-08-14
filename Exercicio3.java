package PacoteJava;

import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		int carga,hora,minuto,segundo;
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com a carga horária em segundos:");
		carga = ler.nextInt();
		hora = carga/3600;
		minuto = carga/60;
		segundo = carga;
		System.out.print("O tempo em horas é: ");
		System.out.println(hora);
		System.out.print("O tempo em minutos é: ");
		System.out.println(minuto);
		System.out.print("O tempo em segundos é: ");
		System.out.println(segundo);
		

	}

}
