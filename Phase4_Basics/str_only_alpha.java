import java.util.*;
class str_only_alpha {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String res="";
        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch)) res+=ch;
        }
        System.out.println(res);
    }
}