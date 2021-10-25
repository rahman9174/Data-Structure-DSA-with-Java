public class abc {
    public static void main(String [] args){
        int N = 100;
        int count  = 0;
        for(int i=100;N>=1;N--){
            if(N%2==0){
                count++;
                N=N/2;
            }
            else{
                count++;
                N=N/5;
            }
        }
        System.out.print(count);
    }
    
}