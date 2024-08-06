import java.util.*;
class Ap5{
    public static void main(String args[]){


        int even_count = 0;
        int odd_count = 0;
        int n;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number of values:");
        n=sc.nextInt();
        int[]arr=new int[n];

        for (int i = 0; i <n; i++) {
            System.out.println("Enter value:");
                    arr[i]=sc.nextInt();

            if ((arr[i] %2) ==0 )
                even_count++;
            else
                    odd_count++;

            }

        System.out.println("Number of even"
                + " elements = " + even_count
                + " Number of odd elements = "
                + odd_count);
    }



}
