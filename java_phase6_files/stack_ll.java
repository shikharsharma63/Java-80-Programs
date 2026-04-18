class stack_ll {
    static class Node{
        int data;
        Node next;
        Node(int d){data=d;}
    }

    static Node top;

    static void push(int x){
        Node n=new Node(x);
        n.next=top;
        top=n;
    }

    static void pop(){
        if(top==null) System.out.println("empty");
        else{
            System.out.println(top.data);
            top=top.next;
        }
    }

    public static void main(String[] args){
        push(5); push(8);
        pop();
    }
}