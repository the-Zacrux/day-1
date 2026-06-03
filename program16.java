import java.util.Scanner;       
public class program16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers :");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for(int i=n1; i<=n2; i++){
            int dig=0,n=i,n3=i,n4=i;
            double sum=0;
            while(n>0){
                dig++;
                n=n/10;
            }
            while(n3>0){
                sum=sum+(int)Math.pow(n3%10, dig);
                n3=n3/10;
            }
            if(sum==n4){
                System.out.println(n4+" is an Armstrong number");
            }
        }
        sc.close();
    }
}