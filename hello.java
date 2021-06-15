import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        /*
         * int a, b, c; Scanner s = new Scanner(System.in);
         * System.out.println("Enter the value of a: "); a = s.nextInt();
         * System.out.println("Enter the value of b: "); b = s.nextInt(); c = a + b;
         * System.out.println("result is: " + c);
         */

        String name;
        long phoneNo;
        boolean isStudent;
        float marks;
        Scanner s = new Scanner(System.in);

        System.out.print("enter your name: ");
        name = s.nextLine();

        System.out.print("enter your phone number: ");
        phoneNo = s.nextLong();

        System.out.print("are you a student: ");
        isStudent = s.nextBoolean();

        System.out.print("enter your marks: ");
        marks = s.nextFloat();
        s.close();
        /*
         * System.out.print("enter your grade: "); marks = s.next().charAt(0);
         */

        System.out.println("Your answers:");
        System.out.print(
                "name: " + name + "\nphone number: " + phoneNo + "\nStudent: " + isStudent + "\nmarks: " + marks);

    }

}
