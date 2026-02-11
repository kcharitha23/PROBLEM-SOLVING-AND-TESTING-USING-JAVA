import java.util.*;

class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  
        while (t-- > 0) {
            int a = sc.nextInt();   
            int n = sc.nextInt();   
            if (isPalindrome(n)) {
                System.out.println("PALINDROME");
            } else if (n % 2 == 0) {
                System.out.println("EVEN");
            } else if (isPrime(n)) {
                System.out.println("PRIME");
            } else if (n > 1) {
                System.out.println("COMPOSITE");
            } else {
                System.out.println("ODD");
            }
        }

        sc.close();
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static boolean isPalindrome(int n) {
        int temp = n, rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return temp == rev;
    }
}
