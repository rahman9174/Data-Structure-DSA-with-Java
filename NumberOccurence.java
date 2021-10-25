class NumberOccurence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter the numbers in the array : ");

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter  the targeted value in the array : ");
        int target = sc.nextInt();

        int firstOccurence = 0;
        int lastOccurence = 0;
        count = 0 ;


        for(int i = 0 ; i < n ; i++){
            if(arr[i] == target && count ==0){
                firstOccurence = i;
                count++;
            }
            else if( arr[i] == target){
                count++;
            }
        }


        

    }
}