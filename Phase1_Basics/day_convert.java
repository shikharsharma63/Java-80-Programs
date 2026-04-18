import java.util.*;
class day_convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int yr = days / 365;
        int rem = days % 365;
        int wk = rem / 7;
        int d = rem % 7;
        System.out.println(yr+" years");
        System.out.println(wk+" weeks");
        System.out.println(d+" days");
    }
}