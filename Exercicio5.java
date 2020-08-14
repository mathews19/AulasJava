package PacoteJava;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float n1,n2,n3,mf;
		System.out.println("Entre com a nota 1: ");
		n1 = ler.nextFloat();
		System.out.println("Entre com a nota 2: ");
		n2 = ler.nextFloat();
		System.out.println("Entre com a nota 3: ");
		n3 = ler.nextFloat();
		mf = (n1*2+n2*3+n3*5)/10;
		System.out.println("A média final é: "+mf);
		

	}

}
