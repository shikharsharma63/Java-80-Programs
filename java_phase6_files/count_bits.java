import java.util.*;
class count_bits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        while(n>0){
            if((n&1)==1) c++;
            n=n>>1;
        }
        System.out.println(c);
    }
}