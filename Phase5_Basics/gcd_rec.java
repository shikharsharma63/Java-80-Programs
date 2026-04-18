import java.util.*;
class gcd_rec {
    static int g(int a,int b){
        if(b==0) return a;
        return g(b,a%b);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt(), y=sc.nextInt();
        System.out.println(g(x,y));
    }
}