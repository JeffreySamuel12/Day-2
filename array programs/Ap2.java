import java.util.*;
public class Ap2{
    public static void main(String args[]){
        int sum=0;
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of values required:");
        int n =sc.nextInt();
        int[]arr=new int[n];
        for(int i =0;i<n;i++){
            System.out.println("Enter the value:");
            arr[i]= sc.nextInt();
            sum+=arr[i];

        }
	System.out.println("The sum of the array is "+ sum);
        System.out.println("The avg of the array sum is "+ sum/n);



    }
}