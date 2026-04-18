import java.util.*;
class hanoi {
    static void move(int n,char s,char d,char h){
        if(n==1){
            System.out.println(s+"->"+d);
            return;
        }
        move(n-1,s,h,d);
        System.out.println(s+"->"+d);
        move(n-1,h,d,s);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        move(n,'A','C','B');
    }
}