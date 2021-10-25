import java.util.*;
class Duplicate {
    public static void main(String[] args){

        int[] arr = {1,2,3,2,4,5,6,3,5};
        Arrays.sort(arr);
        int count;
        for(int i=0;i<arr.length;i++){
            //System.out.print(arr[i]+" ");
            count=0;

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>=1){
            System.out.println(arr[i]+" : "+count);
            }
        }
    }
}