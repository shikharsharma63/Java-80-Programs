import java.util.*;
class str_compare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        if(a.length()!=b.length()){
            System.out.println("not equal");
        } else {
            int f=0;
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)!=b.charAt(i)){
                    f=1; break;
                }
            }
            if(f==0) System.out.println("equal");
            else System.out.println("not equal");
        }
    }
}