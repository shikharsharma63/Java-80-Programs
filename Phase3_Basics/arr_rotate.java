import java.util.*;
class arr_rotate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int d=sc.nextInt();
        for(int i=0;i<d;i++){
            int first=a[0];
            for(int j=0;j<n-1;j++){
                a[j]=a[j+1];
            }
            a[n-1]=first;
        }
        for(int x:a) System.out.print(x+" ");
    }
}