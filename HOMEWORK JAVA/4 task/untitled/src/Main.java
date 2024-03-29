import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total = 0;
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            total = total + i;
        }

        System.out.println(total);

    }
}