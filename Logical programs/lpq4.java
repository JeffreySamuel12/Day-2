import java.util.*;
public class lpq4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n =sc.nextInt();
        int count = 0;
        if (n <= 1) {
            System.out.println("The number is not prime");
            return;
        }

        
        for (int j = 1; j <= n / 2; j++) {
            if (n % j == 0) {
                count++;
            }
        }

	if (count > 1) {
            System.out.println("The number is not prime");
        }
        else {
            System.out.println("The number is prime");
        }
}
}