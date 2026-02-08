import java.util.Scanner;

class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        if (n == 0) {
            System.out.println("Fibonacci(" + n + ") = 0");
        } else if (n == 1) {
            System.out.println("Fibonacci(" + n + ") = 1");
        } else {
            for (int i = 2; i <= n; i++) {
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println("Fibonacci(" + n + ") = " + b);
        }

        sc.close();
    }
}
