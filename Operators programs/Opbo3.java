class Opbo3 {


    static boolean isEven(int n)
    {
        
        return ((n & 1) != 1);
    }

    
    public static void main(String[] args)
    {
        int n = 101;
        System.out.print(isEven(n) == true ? "Even"
                : "Odd");
    }
}

