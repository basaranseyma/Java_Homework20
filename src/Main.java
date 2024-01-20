import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, r, com;
        int factn = 1;
        int factr = 1;
        int factnr = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Hello! This program calculates the combination of n choose r. \nPlease enter the number n: ");
        n = sc.nextInt();

        System.out.print("Please enter the number r: ");
        r = sc.nextInt();

        if (n >= r && r >= 0) {

            // The factorial of n
            for (int i = 1; i <= n; i++) {
                factn *= i;
            }

            // The factorial of r
            for (int i = 1; i <= r; i++) {
                factr *= i;
            }

            // (n-r) factorial
            for (int i = 1; i <= n - r; i++) {
                factnr *= i;
            }

            // combination formula
            com = factn / (factr * factnr); // I adapted this formula to the code: C(n, r) = n! / (r! * (n-r)!)
            System.out.println("Combination: " + com);
        } else {
            System.out.println("For the expression to be valid, the inputs must satisfy this condition: n ≥ r ≥ 0");
        }
    }
}