class call_demo {

    static void change(int x){
        x = x + 10;
    }

    public static void main(String[] args){
        int a=5;
        change(a);
        System.out.println(a); // no change
    }
}
