import java.util.*;
class Insertion{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println();
        System.out.print("Enter "+n+" element in the array : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // sort the array with the help of Insertion sort 
        for(int i=1;i<n;i++){
            
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        System.out.println("sorted array is : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }


    }
}