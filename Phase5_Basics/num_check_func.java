import java.util.*;
class num_check_func {

    static void check(int n){
        int sum=0,temp=n;
        while(n>0){
            int d=n%10;
            sum+=d*d*d;
            n/=10;
        }
        if(sum==temp) System.out.println("armstrong");
        else System.out.println("not armstrong");
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        check(x);
    }
}