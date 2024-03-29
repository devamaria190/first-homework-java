import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("First digit: ");
        int a = input.nextInt();
        System.out.println("Second digit: ");
        int b = input.nextInt();
        boolean flag = true;
        System.out.println(a * b + "\n");
        System.out.println("Shall we continue? 0 - yes. 1 - no.");
        int digit = input.nextInt();

        while (flag) {
            if (digit == 1) {
                flag = false;
            } else {
                System.out.println("First digit: ");
                a = input.nextInt();
                System.out.println("Second digit: ");
                b = input.nextInt();
                System.out.println(a * b + "\n");
                System.out.println("Shall we continue? 0 - yes. 1 - no.");
                digit = input.nextInt();
            }
        }

    }
}