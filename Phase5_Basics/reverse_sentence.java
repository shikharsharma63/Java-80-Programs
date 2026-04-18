import java.util.*;
class reverse_sentence {
    static void rev(String s){
        if(s.length()==0) return;
        rev(s.substring(1));
        System.out.print(s.charAt(0));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        rev(s);
    }
}