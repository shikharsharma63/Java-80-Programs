import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        System.out.print("Enter a float: ");
        float f = sc.nextFloat();

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        System.out.println("Integer: " + num);
        System.out.println("Float: " + f);
        System.out.println("Character: " + ch);
    }
}
