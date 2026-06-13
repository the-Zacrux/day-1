import java.util.Scanner;
public class program54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = scanner.nextInt();
        System.out.println("Enter the elements:");
        int arr[]=new int[length];
        for(int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the number to find its frequency:");
        int num = scanner.nextInt();
        int count = 0;
        for(int i = 0; i < length; i++) {
            if(arr[i] == num) {
                count++;
            }
        }
        System.out.println("Frequency of the number: " + count);
        scanner.close();
    }
}