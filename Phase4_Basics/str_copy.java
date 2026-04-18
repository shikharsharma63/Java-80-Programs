import java.util.*;
class str_copy {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char a[]=s.toCharArray();
        char b[]=new char[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        System.out.println(new String(b));
    }
}