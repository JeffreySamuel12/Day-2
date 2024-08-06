import java.util.*;
class Ap8{
    public static void main(String args[]){


        int n;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number of values:");
        n=sc.nextInt();
        int[]arr=new int[n];

        for (int i = 0; i <n; i++) {
            System.out.println("Enter value:");
                    arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]) {
                    System.out.println("duplicate element found:" + arr[i]);
                    
                }
                else{
                    System.out.println("no duplicate found");
                }
                }
}}}