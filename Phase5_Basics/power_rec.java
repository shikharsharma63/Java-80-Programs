import java.util.*;
class power_rec {
    static int p(int a,int b){
        if(b==0) return 1;
        return a*p(a,b-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt();
        System.out.println(p(a,b));
    }
}