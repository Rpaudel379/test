import java.util.Scanner;

class P2 {
    public static void main(String[] args) {

        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("enter value of a: ");
        a = input.nextInt();
        System.out.print("enter value of a: ");
        b = input.nextInt();
        input.close();
        ADD2 add = new ADD2();
        add.add(a, b);
    }
}

class ADD2 {
    void add(int x, int y) {
        int res = x + y;
        System.out.println("sum is: " + res);
    }
}