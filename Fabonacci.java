import java.util.*;

class Fabonacci{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int fab = fabonacci(n);
       System.out.println(fab);
    }
    public static int fabonacci(int n){
        if(n<=1)
        return 1;

        //System.out.print(fabonacci(n-1)+fabonacci(n-2)+ " ");
        
        return (fabonacci(n-1) + fabonacci(n-2)); 
    }
}