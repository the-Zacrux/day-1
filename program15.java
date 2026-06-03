import java.util.Scanner;       
public class program15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers :");
        int n1 = sc.nextInt();
        int dig=0,n=n1,n2=n1;
        double sum=0;
        while(n1>0){
            dig++;
            n1=n1/10;
        }
        while(n>0){
            sum=sum+(int)Math.pow(n%10, dig);
            n=n/10;
        }
        System.out.println((sum==n2)?"Armstrong number":"Not an Armstrong number");
        sc.close();
    }
}