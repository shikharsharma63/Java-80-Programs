import java.util.*;
class char_type {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(Character.isLetter(ch))
            System.out.println("alphabet");
        else if(Character.isDigit(ch))
            System.out.println("digit");
        else
            System.out.println("special");
    }
}