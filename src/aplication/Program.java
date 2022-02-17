package aplication;
import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What do you want to do? (insert the number)");
		System.out.printf("1: Sum%n2: Subtraction%n3: Multiplication%n4: Division%nOver 5: Exit%n");
		int operation = sc.nextInt();
		
		if(operation >=5) {
			System.out.println("PROGRAM CLOSED!");
			System.exit(0);
		}
		
		System.out.println("How many numbers will be calculated?");
		int quantNumbers= sc.nextInt();
		
		System.out.println("Insert the numbers: ");
		if(operation== 1) {
			double sum =0;
			for (int i=0; i<quantNumbers; i++) {
				sum += sc.nextDouble();
			}
			System.out.println("Result: "+ sum);
		}
		else if(operation == 2) {
			double subtraction = sc.nextDouble();
			for (int i=1; i<quantNumbers; i++) {
				subtraction -= sc.nextDouble();
			}
			System.out.println("Result: "+ subtraction);
		}
		else if (operation == 3) {
			double multiplication = sc.nextDouble();
			for (int i=1; i<quantNumbers; i++) {
				multiplication *= sc.nextDouble();
			}
			System.out.println("Result: " + multiplication);
		}
		else if (operation == 4) {
			double division = sc.nextDouble();
			for (int i=1; i<quantNumbers; i++) {
				division /= sc.nextDouble();
			}
			System.out.println("Result: "+ division);
		}
		
		sc.close();
	}

}
