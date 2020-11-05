package es.studium.Expresion;

import java.util.Scanner;

public class Expresion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int a,b,c;
		float r;
		System.out.println("Dame un número equivalente a la letra a ");
		a = teclado.nextInt();
		System.out.println("Dame un número equivalente a la letra b ");
		b = teclado.nextInt();
		System.out.println("Dame un número equivalente a la letra c ");
		c = teclado.nextInt();
		teclado.close();
		r=expresion(a,b,c);
		System.out.println("El resultado de aplicar la expresión los números dados es: " + r);
			}
	public static float expresion(int a,int b, int c) {
		float resultado;
		resultado= (float)((b*b)-(4*a*c))/(float)(2*a);
		return (resultado);
				
	}

}
