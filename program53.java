import java.util.Scanner;
public class program53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = scanner.nextInt();
        System.out.println("Enter the elements:");
        int arr[]=new int[length];
        for(int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the number to search:");
        int num = scanner.nextInt();
        for(int i = 0; i < length; i++) {
            if(arr[i] == num) {
                System.out.println("Number found at index: " + i);
                return;
            }
        }
        System.out.println("Number not found.");
        scanner.close();
    }
}