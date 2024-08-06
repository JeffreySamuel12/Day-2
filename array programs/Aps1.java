import java.util.*;


class Aps1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String str=sc.next();
        String str_org=str;

        String rev="";
        int len=str.length();

        for(int i=len-1; i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(str_org.equals(rev)) {
            System.out.println("The String is a palindrom");
        }
            else{
                System.out.println("The String is not a palindrom");

        }

    }
    }