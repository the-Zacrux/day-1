import java.util.Scanner;
public class program51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = scanner.nextInt();
        System.out.println("Enter the elements:");
        int arr[]=new int[length];
        int large;
        int small;
        for(int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        large = arr[0];
        small = arr[0];
        for(int i = 0; i < length; i++) {
            if(arr[i]>large) {
                large=arr[i];
            }
            if(arr[i]<small) {                  
                small=arr[i];
            }
        }
        
        System.out.println("Largest: " + large);
        System.out.println("Smallest: " + small);
        scanner.close();
    }
}
