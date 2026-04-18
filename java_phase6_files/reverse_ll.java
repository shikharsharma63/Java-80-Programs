class reverse_ll {
    static class Node{
        int data;
        Node next;
        Node(int d){data=d;}
    }

    static Node rev(Node head){
        Node prev=null,cur=head;
        while(cur!=null){
            Node nxt=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nxt;
        }
        return prev;
    }

    public static void main(String[] args){
        Node a=new Node(1);
        a.next=new Node(2);
        a.next.next=new Node(3);

        Node r=rev(a);
        while(r!=null){
            System.out.print(r.data+" ");
            r=r.next;
        }
    }
}