import java.util.Scanner;

class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        if (temp == reverse) {
            System.out.println(temp + " is a Palindrome");
        } else {
            System.out.println(temp + " is Not a Palindrome");
        }

        sc.close();
    }
}
