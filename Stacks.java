import java.util.Scanner;
// System.out.print("")

public class Stacks {

    static int stack[];
    static int size, choice, top = -1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("size of stack: ");
        size = input.nextInt();

        stack = new int[size];

        for (;;) {

            System.out.println("1.push 2.pop 3.display 4.exit");

            System.out.print("enter choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    return;

                default:
                    System.out.println("invalid choice");
                    break;
            }

        }

    }

    static void push() {
        if (top == size - 1) {
            System.out.println("Stack overflow");
        } else {
            top++;
            System.out.print("enter element to push: ");
            Scanner input = new Scanner(System.in);
            stack[top] = input.nextInt();
            System.out.println("element pushed: " + stack[top]);
        }
    }

    static void pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
        } else {
            System.out.println("popped element: " + stack[top]);
            top--;
        }
    }

    static void display() {
        if (top == -1) {
            System.out.println("Stack underflow");
        } else {
            System.out.print("elements are: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();

        }
    }

}
