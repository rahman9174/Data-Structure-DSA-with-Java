import java.util.*;
class BubbleSort1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // for taking input in arrays
        System.out.print("enter elements in array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //{11,8,33,22,66}

        // for array sort with bubble sort
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr [i] > arr[j]){
                    int temp = arr[i] + arr[j];
                    arr[i] = temp - arr[i];
                    arr[j] = temp - arr[j];
                }
                //System.out.println("pass : "+i +"  :"arr[j]);
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}