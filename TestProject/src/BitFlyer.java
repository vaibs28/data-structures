
public class BitFlyer {

    public static void main(String[] args) {

        double[] blockSize = { 57247, 98732, 134928, 77275, 29240, 15440, 70820, 139603, 63718, 143807, 190457, 40572 };
        double[] transactionFee = { 0.0887, 0.1856, 0.2307, 0.1522, 0.0532, 0.025, 0.1409, 0.2541, 0.1147, 0.266, 0.2933, 0.0686};
        double max=0.0d;
        double maxBlocksize=0;
        double sum=0.0d;
        int i=0;
        int j=0;
        for(i=0;i<blockSize.length;i++) {
            j=i+1;
            while(j<blockSize.length && maxBlocksize<=500000) {
                maxBlocksize = maxBlocksize + blockSize[i];
                sum = transactionFee[i]+transactionFee[j];
                j++;
            }
            if(sum>max)
                max = sum;
        }
        
        double res = 12.5+max;
        System.out.println(res);
        
        sum=0.9376;
        
       
        
        
    }

   public static void sort(double[] arr) {
       for(int i=0;i<arr.length-1;i++) {
           for(int j=0;j<(arr.length-i-1);j++) {
               if(arr[j]>arr[j+1]) {
                   double temp = arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }
   }
}
