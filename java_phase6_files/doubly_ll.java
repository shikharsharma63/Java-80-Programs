class doubly_ll {
    static class Node{
        int data;
        Node prev,next;
        Node(int d){data=d;}
    }

    static Node head;

    static void add(int x){
        Node n=new Node(x);
        if(head==null) head=n;
        else{
            Node t=head;
            while(t.next!=null) t=t.next;
            t.next=n;
            n.prev=t;
        }
    }

    static void show(){
        Node t=head;
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
    }

    public static void main(String[] args){
        add(5); add(15); add(25);
        show();
    }
}