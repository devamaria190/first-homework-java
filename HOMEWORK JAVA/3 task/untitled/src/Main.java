class MyProgram {
    public static void main(String[] args) {

        boolean flag = true;
        int count = 1;

        while (flag) {

            if (count > 10) {
                flag = false;
            } else {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(count + " * " + i + " = " + count * i);
                }
                System.out.println("\n");
                count += 1;
            }

        }

    }
}