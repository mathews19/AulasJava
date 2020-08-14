package PacoteJava;

import java.util.Scanner;
import java.math.*;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float x1,x2,y1,y2,s1,s2,d;
		System.out.print("Entre com os valores de x1 e y1 ");
		x1 = ler.nextFloat();
		y1 = ler.nextFloat();
		System.out.print("Entre com os valores de x2 e y2 ");
		x2 = ler.nextFloat();
		y2 = ler.nextFloat();
		s1 = (int) Math.pow((x2-x1),2);
		s2 = (int) Math.pow((y2-x2),2);
		d = (float) Math.sqrt((s1+s2));
		System.out.println("O valor de s1 é: "+s1);
		System.out.println("O valor de s2 é: "+s2);
		System.out.println("O valor de d é: "+d);
		
		
		
		
		

	}

}
