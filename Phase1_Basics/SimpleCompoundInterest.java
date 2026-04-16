import java.util.Scanner;

public class SimpleCompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal (P): ");
        double P = sc.nextDouble();

        System.out.print("Enter Rate (R): ");
        double R = sc.nextDouble();

        System.out.print("Enter Time (T in years): ");
        double T = sc.nextDouble();

        double SI = (P * R * T) / 100;

        double CI = P * Math.pow((1 + R/100), T) - P;

        System.out.println("Simple Interest = " + SI);
        System.out.println("Compound Interest = " + CI);
    }
}
