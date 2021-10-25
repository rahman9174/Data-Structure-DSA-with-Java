class MergerTwoSortedArray{
    public static void main(String[] args){
        int[] arr = {50,60,70,80};
        int[] brr = {80,90,100};

        int m = arr.length;
        int n = brr.length;
        int l = m+n;

        int[] ans = new int[l];

        int i = 0, j=0, k=0;

        while(i<m && j<n){
            if( arr[i] < brr[j]){
                ans[k] = arr[i];
                i++;
            }
            else{
                ans[k] = brr[j];
                j++;
            }
            k++;
        }
        while(i<m){
            ans[k] = arr[i];
            i++;
            k++;
        }
        while(j<n){
            ans[k] = brr[j];
            j++;
            k++;
        }
        System.out.print("Sorted array is : ");
        for(i=0;i<l;i++){
            System.out.print(ans[i]+" ");
        }
    }
}