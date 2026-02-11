import java.util.*;

class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] names = new String[n];
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            ages[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        
       for (int i = 0; i < n; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println();

      
          for (int i = 0; i < n; i++) {
            if (ages[i] >= x) {
                System.out.print(names[i] + " ");
            }
        }
        System.out.println();

     
        for (int i = 0; i < n; i++) {
            System.out.print(names[i].toUpperCase() + " ");
        }

        sc.close();
    }
}
