import java.util.*;
class even_mod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        if(val % 2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}