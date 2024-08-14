package sum;
import java.util.Scanner;

public class SomaDoisNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, sum = 0;
		
		System.out.println("Digite um numero: ");
		n1 = sc.nextInt();
		System.out.println("Digite um numero: ");
		n2 = sc.nextInt();
		
		sum = n1+n2;
		
		System.out.println("Soma: " + (n1+n2));
		
		sc.close();
	}
}
