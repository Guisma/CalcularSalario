package AulaUniaeso;

import java.util.Locale;
import java.util.Scanner;

public class Atividadetres {


	private static Scanner console;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		console = new Scanner(System.in);
		
		System.out.print("Digite a sua Nota: ");
		double nota = console.nextDouble();
		
		if(nota >= 9.0){
			System.out.print("A");
		}else if((nota <= 8.0) && (nota < 9.00)) {
			System.out.println("B");
		}else if((nota <= 7.0) && (nota < 8.00)) {
			System.out.print("C");
		}else if((nota <= 6.0) && (nota < 7.00)) {
			System.out.print("D");
		}else if((nota < 6.0))  {
			System.out.print("E");
		}
	}
}



package AulaUniaeso;

import java.util.Scanner;

public class atividade{
 public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Digite seu nome: ");
       String nome = sc.nextLine();
       System.out.println("Digite o seu salario: ");
       double salario = sc.nextDouble();

       double salarioReagustado;
    
       if (salario >= 150){
           salarioReagustado = (salario + (salario * 25)/100);
           System.out.println(nome + " o seu salario é " + salarioReagustado);
       } else if (salario > 150 && salario <= 300){
            salarioReagustado = (salario +(salario * 20)/ 100);
            System.out.println(nome + " O seu salario é " + salarioReagustado);
       } else if (salario >= 300 && salario < 600){
           salarioReagustado = (salario +(salario * 15)/ 100);
           System.out.println(nome + " O seu salario é " + salarioReagustado);
       } else if (salario >= 600){
           salarioReagustado = (salario +(salario * 15)/ 100);
           System.out.println(nome + " O seu salario é " + salarioReagustado);
       }
           
    
           
       }
       
    }
