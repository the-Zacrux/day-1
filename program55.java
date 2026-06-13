import java.util.Scanner;
public class program55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = scanner.nextInt();
        System.out.println("Enter the elements:");
        int arr[]=new int[length];
        for(int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        int largest1 = arr[0];
        int largest2 = arr[0];
        for(int i = 0; i < length; i++) {
            if(arr[i] > largest1) {
                largest1 = arr[i];
            } 
            if(arr[i] > largest2 && arr[i] < largest1) {
                largest2 = arr[i];
            }
        }
        System.out.println("The second largest number is: " + largest2);
        scanner.close();
    }
}