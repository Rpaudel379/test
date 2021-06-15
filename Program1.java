import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the no of students: ");
        int n = input.nextInt();

        Student obj[] = new Student[n];

        for (int i = 0; i < n; i++) {
            obj[i] = new Student();
            obj[i].read();
        }

        for (int i = 0; i < n; i++) {
            obj[i].print();
        }
        input.close();

    }

}

class Student {
    public String name, usn, branch, phno;

    // String name, String usn, String branch, String phno
    public void read() {
        Scanner input = new Scanner(System.in);

        System.out.print("enter name: ");
        name = input.nextLine();

        System.out.print("enter usn: ");
        usn = input.nextLine();

        System.out.print("enter branch: ");
        branch = input.nextLine();

        System.out.print("enter phone number: ");
        phno = input.nextLine();
        input.close();
    }

    public void print() {
        System.out.println("Student name is " + name);
        System.out.println("Student usn is " + usn);
        System.out.println("Student branch is " + branch);
        System.out.println("Student phone number is " + phno);
    }

}