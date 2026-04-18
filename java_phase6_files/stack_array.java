import java.util.*;
class stack_array {
    static int top=-1;
    static int a[]=new int[10];

    static void push(int x){
        if(top==9) System.out.println("full");
        else a[++top]=x;
    }

    static void pop(){
        if(top==-1) System.out.println("empty");
        else System.out.println(a[top--]);
    }

    public static void main(String[] args){
        push(10); push(20);
        pop();
    }
}