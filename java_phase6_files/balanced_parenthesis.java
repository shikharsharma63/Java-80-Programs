import java.util.*;
class balanced_parenthesis {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Stack<Character> st=new Stack<>();

        for(char c: s.toCharArray()){
            if(c=='(') st.push(c);
            else{
                if(st.isEmpty()){
                    System.out.println("no");
                    return;
                }
                st.pop();
            }
        }

        if(st.isEmpty()) System.out.println("yes");
        else System.out.println("no");
    }
}