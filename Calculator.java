import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Add  2.Sub  3.Mul  4.Div  5.Exit");
            int choice = sc.nextInt();

            if (choice == 5) break;

            System.out.print("Enter 2 numbers: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            if (choice == 1) System.out.println("Ans = " + (a + b));
            else if (choice == 2) System.out.println("Ans = " + (a - b));
            else if (choice == 3) System.out.println("Ans = " + (a * b));
            else if (choice == 4) {
                if (b == 0) System.out.println("Cannot divide by 0");
                else System.out.println("Ans = " + (a / b));
            }
        }
    }
}