class linked_list_basic {
    static class Node {
        int data;
        Node next;
        Node(int d){ data=d; next=null; }
    }

    static Node head=null;

    static void insert(int x){
        Node n=new Node(x);
        if(head==null) head=n;
        else{
            Node t=head;
            while(t.next!=null) t=t.next;
            t.next=n;
        }
    }

    static void display(){
        Node t=head;
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
    }

    public static void main(String[] args){
        insert(10); insert(20); insert(30);
        display();
    }
}