public class Add {
    public static void main(String[] args) {

        Add1 add = new Add1();
        int c = add.add(10,20);
        System.out.print(c);

    }

}

class Add1 {
    int add(int x, int y) {
        return x + y;
    }
}