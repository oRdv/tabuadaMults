package br.senai.sp.jandira;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int min, max, resultado, mult;
		
		System.out.print("Olá, Bem-Vindo (a) a Tabuada! Por favor insira o número que quer múltiplicar: ");
		mult = teclado.nextInt();
		
		
		System.out.print("Agora insira o número que devera começar, logo, o valor MÍNIMO: ");
		min = teclado.nextInt();
		
		System.out.print("Insira o valor MÁXIMO que a multiplicaçã: ");
		max = teclado.nextInt();
		
		System.out.println("Tabuada do " + mult);
		
		if(min == max) {
			resultado = mult * min;
			
			System.out.println(mult + "x" + min +  "=" + resultado);
		}
		
		if(min < max) {
			while (min != max + 1) {
				resultado = mult + min;
				
			System.out.println(mult + "x" + min + "=" + resultado);
				min++;
				
			}
		}else {
			while (max != min + 1) {
				resultado = mult * max;
				
				System.out.println( mult + "x" + max + "=" + resultado);
				max++;
			}
		}
			
			
		
		

	}

}
