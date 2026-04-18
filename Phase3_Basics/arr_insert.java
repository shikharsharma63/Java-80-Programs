import java.util.*;
class arr_insert {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[100];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int pos=sc.nextInt();
        int val=sc.nextInt();
        for(int i=n;i>pos;i--){
            a[i]=a[i-1];
        }
        a[pos]=val;
        n++;
        for(int i=0;i<n;i++) System.out.print(a[i]+" ");
    }
}