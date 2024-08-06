
import java.util.*;
public class Oplo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number1:");
        int n1 = sc.nextInt();
        


        if((n1%5==0)&&(n1%7==0)){
            System.out.println("Number is divisble by both 5 and 7:");
        }
        else{
            System.out.println("Number is not divisible by both 5 and 7");
        }
    }}