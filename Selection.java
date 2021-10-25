/* Program : Selection sort
   Name    : Rahman
   Date    : 01/09/2021
*/

import java.util.*;

class Selection{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        System.out.println();
        int[] arr = new int[n];

        // for taking input in array . i.e unsorted array 
        System.out.print("Enter "+n+" element in the array : ");

        for(int i=0;i<n;i++){          
            arr[i] = sc.nextInt();
        }

        // selection sort logic
        for(int i=0;i<n-1;i++){
            int min_index = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[min_index];
             arr[min_index] = arr[i];
            arr[i] = temp;
        }
        System.out.print("Sorted array is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }


    }
}