package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter glucose measure: ");
		double glucose = sc.nextDouble();
		
		if (glucose <= 100) {
			System.out.println("Normal");
		}
		else if (glucose <= 140) {
			System.out.println("High");
		}
		else {
			System.out.println("Diabetes");
		}
		
		sc.close();
	}
}