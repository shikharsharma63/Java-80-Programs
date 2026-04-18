class queue_array {
    static int a[]=new int[10];
    static int f=0,r=-1;

    static void add(int x){
        if(r==9) System.out.println("full");
        else a[++r]=x;
    }

    static void remove(){
        if(f>r) System.out.println("empty");
        else System.out.println(a[f++]);
    }

    public static void main(String[] args){
        add(1); add(2);
        remove();
    }
}