import java.util.Scanner;

public class PatronNumerico {

    public static void main(String[]arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entero positivo:");
        int num1 = scanner.nextInt();
        if (num1 > 0) {
        } else {
            System.out.println("Por favor, introduce un número entero positivo.");
        }
        scanner.close();

        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("    ");
            }
            for (int j = i; j <= num1; j++) {
                System.out.print(j + "  ");
            }
            for (int j = num1 - 1; j >= i; j--) {
                System.out.print(j + "   ");
            }
            System.out.println();
        }
    }
}