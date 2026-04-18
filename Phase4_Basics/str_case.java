import java.util.*;
class str_case {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String low="", up="";
        for(char ch: s.toCharArray()){
            if(ch>='A' && ch<='Z') low+=(char)(ch+32);
            else low+=ch;
        }
        for(char ch: s.toCharArray()){
            if(ch>='a' && ch<='z') up+=(char)(ch-32);
            else up+=ch;
        }
        System.out.println(low);
        System.out.println(up);
    }
}
