import java.util.Scanner;
class Task9{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int[] n = sc.nextInt();
       int n = 0;
       for(int i=3 ; i <= n;i++ ){
       int a= 0;
       int b= 1;
       int c= a + b;
       System.out.println(c+" ");
            a = b;
            b = c;
       }
   }
}