import java.util.*;
public class Oparq2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number1:");
        int n1 = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            // printing the N*i,ie ith multiple of N.
            System.out.println(n1 + " * " + i + " = "
                    + n1 * i);
        }
    }}