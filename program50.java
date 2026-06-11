import java.util.Scanner;
public class program50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = scanner.nextInt();
        System.out.println("Enter the elements:");
        int arr[]=new int[length];
        int sum = 0;
        int ave=0;
        for(int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        ave = sum / length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + ave);
        scanner.close();
    }
}
