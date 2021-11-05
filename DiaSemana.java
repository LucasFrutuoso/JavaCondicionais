package exercicios;

import java.util.Scanner;

public class DesafioDiaDaSemana {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o número correspondente ao dia da semana:");

	System.out.println("1- Domingo\n2- Segunda\n3- Terça\n4- Quarta\n5- Quinta\n6- Sexta\n7- Sábado");
	int dia = sc.nextInt();
	
	if(dia == 1) {
		System.out.println("Domingo");
	}else if(dia == 2) {
		System.out.println("Segunda");
	}else if(dia==3){
		System.out.println("Terça");
	}else if(dia==4){
		System.out.println("Quarta");
	}else if(dia==5){
		System.out.println("Quinta");
	}else if(dia==6){
		System.out.println("Sexta");
	}else if(dia == 7){
		System.out.println("Sábado");
	}else {
		System.out.println("Digite um número válido!");
	}

    sc.close();
}

}
