import java.util.*;
class circle_calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rad = sc.nextDouble();
        double area = 3.14 * rad * rad;
        double circ = 2 * 3.14 * rad;
        System.out.println(area);
        System.out.println(circ);
    }
}