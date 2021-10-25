class MergeSort{
    public static void main(String [] args){
        int[] arr = {90,23,101,45,65,33,67,89,24,32};
        int len = arr.length;

        //System.out.println("len : "+len);
        mergeSort(arr,0,len);

        for(int  i = 0;i<len;i++){
            System.out.print(arr[i]+"   ");
        }
    }
    public static void mergeSort(int[] arr , int start , int end){
        //System.out.println("merger sort function ");
        if(start<end){
            int mid = start + (end - start)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);

            merge(arr,start,mid,end);
        }
    }
    public static void merge(int[] a     , int start , int mid , int end){
        int left = mid - start + 1;
        int right = end - mid;
        //System.out.println("left : "+left+" right : "+right);

        int leftArray[] = new int[left];
        int rightArray[] = new int[right];

        for(int i=0;i<left;i++){
            leftArray[i] = a[start+i];
            //System.out.println("left Array : "+leftArray[i]+"  ");
        }
        for(int j=0;j<right;j++){
            rightArray[j] = a[mid+1+j];
           // System.out.println("right element : "+rightArray[j]);
        }
        int i=0,j=0,k=start;
        while(i<left && j<right){
            if(leftArray[i]<=rightArray[j]){
                a[k] = leftArray[i];
                i++;

            }
            else{
                a[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while(i<left){
            a[k] = leftArray[i];
            i++;
            k++;
        }
        while(j<right){
            a[k] = rightArray[j];
            j++;
            k++;
        }

    }
    
}