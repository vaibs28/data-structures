package array;

public class PrintPairsWithGivenSum {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] arr = {1,2,3,4,5,6,8,10};
        int sum = 9;
        int l=0;
        int r=arr.length-1;
        
        while(l<r) {
            if((arr[l]+arr[r])==sum) {
                System.out.println(arr[l]+","+arr[r]);
                l++;
            }
            else if((arr[l]+arr[r])<sum) {
                l++;
            }
            else {
                r--;
            }
        }
    }

}
