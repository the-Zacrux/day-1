import java.util.Scanner;
public class program49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = scanner.nextInt();
        System.out.println("Enter the elements:");
        int arr[]=new int[length];
        for(int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}
