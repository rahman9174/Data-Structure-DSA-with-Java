// This is the program to find the factorail of a given number with the recursion technique
/*
 Program name : Factorial with recursion
 Date         : 17th August 2021
 Author       : M.Rahman
*/

import java.util.*;
class Factorial{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int factorial = factorialRecursion(n);
        System.out.print("The factorial of "+n+" is  :  "+factorial);

    }
    public static int factorialRecursion(int a){
        if(a>0){
            return a*factorialRecursion(a-1);
        }
        else 
        return 1;
    }
}