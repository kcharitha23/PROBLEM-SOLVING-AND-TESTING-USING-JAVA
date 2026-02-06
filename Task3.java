import java.util.Arrays;
import java.util.Scanner;
public class Task3 {
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter size of array:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("enter"+n + "elements");
    for(int i = 0; i < n;i++){
        arr[i] =sc.nextInt();
    Arrays.sort(arr);
    System.out.println("Sorted Array:"+ Arrays.toString(arr));
    System.out.println("enter elements to search:");
    int key= sc.nextInt();
int low = 0;, high =n-1;
Boolean found =false;
while(low+ high) / 2;
if (array[mid] ==key) {
 System.out.println("element found at index: " + mid);
found = true;
break;
}else if (arr[mid] <key ){
low = mid+1;
