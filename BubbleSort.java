import java.util.*;

public class BubbleSort{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n]; 
        for(int i=0;i<n;i++){
            System.out.println("Enter elements in the array : ");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    System.out.print("unsorted elements : "+arr[j]+ "  "+arr[j+1]+" ");
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    System.out.print("sort the arry : "+ arr[j]+" "+arr[j+1]+ "  ----> ");
                }

                
            }
            System.out.println(" ");
        }
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]+" ");
        }

    }
}