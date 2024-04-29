import java.util.Scanner;

public class RumusABC {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
char ulangi;

do {
	System.out.println("Masukkan koefisien a:");
	double a = scanner.nextDouble();
	System.out.println("Masukkan koefisien b:");
	double b = scanner.nextDouble();
	System.out.println("Masukkan koefisien c:");
	double c = scanner.nextDouble();

	double D = b * b - 4 * a * c;
	if (D > 0) {
		double x1 = (-b + Math.sqrt(D)) / (2 * a);
		double x2 = (-b - Math.sqrt(D)) / (2 * a);
		System.out.println("Akar-akar persamaan kuadrat:");
		System.out.println("X1 = " + x1);
		System.out.println("X2 = " + x2);
	} else if (D == 0) {
		double x = -b / (2 * a);
		System.out.println("Akar-akar persamaan kuadrat:");
		System.out.println("X1 = X2 = " + x);
	} else {
		double realPart = -b / (2 * a);
		double imaginaryPart = Math.sqrt(-D) / (2 * a);
		System.out.println("Akar-akar persamaan kuadrat:");
		System.out.println("X1 = " + realPart + " + " + imaginaryPart + "i");
		System.out.println("X2 = " + realPart + " - " + imaginaryPart + "i");
	}
	System.out.println("Input data lagi [Y/T]?");
	ulangi = scanner.next().charAt(0);
	} while (ulangi == 'Y' || ulangi == 'y');
	
	scanner.close();
	}
}