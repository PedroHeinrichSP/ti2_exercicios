package exercicio1;
import java.util.*;

class SomarDoisNumeros {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Variáveis a serem usadas
		int num1 = 0, num2 = 0, soma = 0;
		
		// Leitura
		System.out.println("Digite o primeiro número:");
		num1 = sc.nextInt();
		System.out.println("Digite o segundo número:");
		num2 = sc.nextInt();
		
		// Operação
		soma = num1 + num2;
		
		// Mostrar no terminal
		System.out.println("A soma dos seus números é de " + soma);
	}
	
}
