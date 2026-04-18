import java.util.*;
class sum_natural {
    static int s(int n){
        if(n==0) return 0;
        return n + s(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(s(n));
    }
}