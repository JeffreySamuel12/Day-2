import java.util.*;
public class Opbo1 {
    public static void main(String[] args){
        int n1,n2;
        Scanner sc =new Scanner (System.in);
        System.out.println("enter Number1:");
         n1=sc.nextInt();
        System.out.println("enter Number2:");
        n2=sc.nextInt();

        // bitwise and
        // 0101 & 0111=0101 = 5
        System.out.println("n1&n2 = " + (n1 & n2));

        // bitwise or
        // 0101 | 0111=0111 = 7
        System.out.println("n1|n2 = " + (n1 | n2));

        // bitwise xor
        // 0101 ^ 0111=0010 = 2
        System.out.println("a^b = " + (n1 ^ n2));

    }

    }
