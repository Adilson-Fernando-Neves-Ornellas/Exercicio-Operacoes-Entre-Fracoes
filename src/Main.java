import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		menu1();
	}
	public static double  menu1() {
		Scanner input = new Scanner(System.in);
		
		double denominador1;
		double numerador1;
		
		double fracao1;
		
		System.out.print("Digite o numerador da primeira fração: ");
		numerador1 = input.nextInt();
		System.out.print("Digite o denominador da primeira fração: ");
		denominador1 = input.nextInt();
		System.out.println(" A primeira fração é: " +numerador1 +"/"+denominador1);
		fracao1 = (numerador1/denominador1);
		menu2(fracao1);
		return fracao1;
		
	}
	public static double menu2(double fracao1) {
		Scanner input = new Scanner(System.in);
		
		double denominador2;
		double numerador2;
		double fracao2;
		
		System.out.print("Digite o numerador da segunda fração: ");
		numerador2 = input.nextInt();
		System.out.print("Digite o denominador da segunda fração: ");
		denominador2 = input.nextInt();
		System.out.println(" A segunda fração é: " +numerador2 +"/"+denominador2);
		fracao2 = (numerador2/denominador2);
		menu3(fracao1,fracao2);
		return fracao2;
	}
	public static void menu3(double fracao1, double fracao2) {
		Scanner input = new Scanner(System.in);
		
		int opcao;
				
		System.out.println("-------- Menu -------");
		System.out.println("  1- Soma");
		System.out.println("  2- Subtrair");		
		System.out.println("  3- Multiplicação");
		System.out.println("  4- Divisão");
		System.out.print("  Sua opção:");
		opcao = input.nextInt();
		if(opcao>=1 &&opcao <=4) {
			CalculoOperações resultado = new CalculoOperações(fracao1,fracao2,opcao);
			resultado.resultado();	
		}else {
			System.out.println(" Opção Invalida, tente novamente.");
			menu3(fracao1,fracao2);
		}
	}
}
