import java.util.*;
class arr_delete {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[100];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int pos=sc.nextInt();
        for(int i=pos;i<n-1;i++){
            a[i]=a[i+1];
        }
        n--;
        for(int i=0;i<n;i++) System.out.print(a[i]+" ");
    }
}
