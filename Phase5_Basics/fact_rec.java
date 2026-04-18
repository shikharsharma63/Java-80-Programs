import java.util.*;
class fact_rec {
    static int f(int n){
        if(n==1) return 1;
        return n*f(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(f(n));
    }
}