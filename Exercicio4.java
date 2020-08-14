package PacoteJava;
import java.util.Scanner;
import java.math.*;
public class Exercicio4 {

	public static void main(String[] args) {
		int a,b,c,r,s,d;
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com o valor a:");
		a = ler.nextInt();
		System.out.print("Entre com o valor b:");
		b = ler.nextInt();
		System.out.print("Entre com o valor c:");
		c = ler.nextInt();
		r = (int) Math.pow((a+b), 2);
		s = (int) Math.pow((b+c), 2);
		d = (r+s)/2;
		System.out.println("O número r é: "+r);
		System.out.println("O número s é: "+s);
		System.out.println("O número d é: "+d);
		
		
		

	}

}
