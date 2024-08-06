import java.util.*;
public class Opro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number1:");
        int n1 = sc.nextInt();
        System.out.println("enter the number2:");
        int n2 = sc.nextInt();
        System.out.println("enter the number3:");
        int n3 = sc.nextInt();

        if(n1>n2&&n1>n3){
            System.out.println("Maximum of three numbers:"+n1);
        }
        else if(n2>n3&&n2>n1){
            System.out.println("Maximum of three numbers:"+n2);
        }
        else{
            System.out.println("Maximum of three numbers:"+n3);
        }
    }}