package PacoteJava;

import java.util.Scanner;

public class Exercicio7 {
public static void main(String args[]) {
	float a,b,c,d,e,f,x,y;
	Scanner ler = new Scanner(System.in);
	System.out.println("Entre com os valores dos coeficientes: ");
	a = ler.nextFloat();
	b = ler.nextFloat();
	c = ler.nextFloat();
	d = ler.nextFloat();
	e = ler.nextFloat();
	f = ler.nextFloat();
	x = (c*e-b*f)/(a*e-b*d);
	y = (a*f-c*d)/(a*e-b*d);
	System.out.print("O valor da equação é x = ");
	System.out.print(x);
	System.out.println("O valor da equação é y = ");
	System.out.print(y);
	}
	
}

