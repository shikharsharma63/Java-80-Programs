import java.util.*;
class str_concat {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        String res="";
        for(int i=0;i<a.length();i++) res+=a.charAt(i);
        for(int i=0;i<b.length();i++) res+=b.charAt(i);
        System.out.println(res);
    }
}