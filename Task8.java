import java.util.Scanner;
class Task8{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Even numbers:");
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

        System.out.println("Odd numbers:");
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
