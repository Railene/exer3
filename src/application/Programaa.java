package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Nota;

public class Programaa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			Nota aluno = new Nota();
			System.out.println("Nome do Aluno");
			aluno.Nome =  sc.nextLine();
			
			System.out.println("Digite as três Nota do aluno: ");
			aluno.Nota1 =  sc.nextDouble();
			aluno.Nota2 =  sc.nextDouble();
			aluno.Nota3 =  sc.nextDouble();
			
			System.out.printf("Nota Final %.2f%n", aluno.NotaFinal());
			
			if(aluno.NotaFinal() <60.0) {
				System.out.println("Falha");
				System.out.printf("Falta %.2f Pontos%n", aluno.Media());
			}else {
				System.out.println("Aprovado");
				
			}
			
			sc.close();

	}

}
