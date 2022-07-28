import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, c:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("The equation has infinity roots");
                } else {
                    System.out.println("The equation has no real roots");
                }
            } else {
                System.out.printf("The equation has one root %.5f", -c / b);
            }
        } else {
            QuadraticEquation q = new QuadraticEquation(a, b, c);

            double delta = q.getDiscriminant();
            if (delta > 0) {
                System.out.printf("The equation has two roots %.5f and %.5f", q.getRoot1(), q.getRoot1());
            } else if (delta == 0) {
                System.out.printf("The equation has one root %.5f", q.getRoot1());
            } else {
                System.out.println("The equation has no real roots");
            }
        }

    }
}