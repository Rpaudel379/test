import java.util.Scanner;

public class P1 {
    String usn, name, programme;
    long phoneNo;

    void read() {

        Scanner input = new Scanner(System.in);

        System.out.print("enter usn: ");
        usn = input.next();

        System.out.print("enter name: ");
        name = input.next();

        System.out.print("enter programme: ");
        programme = input.next();

        System.out.print("enter phone number: ");
        phoneNo = input.nextLong();
        input.close();
    }

    void display() {
        System.out.println("~~~~~~");
        System.out.println("Result: ");

        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Programme: " + programme);
        System.out.println("Phone number: " + phoneNo);
        System.out.println("~~~~~~");
    }

    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);

        System.out.print("enter number of students: ");
        n = input.nextInt();
        input.close();
        P1[] a = new P1[n];

        for (int i = 0; i < n; i++) {
            a[i] = new P1();
            a[i].read();
        }
        for (int i = 0; i < n; i++) {
            a[i].display();
        }
    }
}
