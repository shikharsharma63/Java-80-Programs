import java.util.*;
class largest_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
        int big=a;
        if(b>big) big=b;
        if(c>big) big=c;
        System.out.println("max="+big);
    }
}