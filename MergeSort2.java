class MergeSort2{
    public static void main(String[] args){
        int[] arr = {90,23,101,45,65,23,67,89,34,23};

        int len = arr.length-1;
        System.out.println("Length : "+len);

        mergeSort(arr,0,len);
        System.out.println(" Sorted Array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"---->");
        }
    }
    public static void mergeSort(int[] arr,int start,int end){
        int mid = start + (end - start)/2;
        if(start<end){
        //System.out.println("mid : --> "+mid);
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);

        merge(arr,start,mid,end);

    }
}
    public static void merge(int[] arr,int start,int mid,int end){
        int left = mid - start + 1;
        int right = end - mid ; 

        int[] leftArray = new int[left];
        int[] rightArray = new int[right];

        for(int i=0;i<left;i++){
            leftArray[i] = arr[start+i];
        }
        for(int j=0;j<right;j++){
            rightArray[j] = arr[mid+1+j];
        }
        int i=0;
        int j=0;
        int k=start;

        while(i<left && j<right){
            if(leftArray[i] <= rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }
            else{
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while(i < left){
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while(j < right){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}