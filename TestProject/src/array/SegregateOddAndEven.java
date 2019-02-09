package array;

public class SegregateOddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int a[] = {2,5,4,6,7,9,10};
	    int l=0,r=a.length-1;
	    while(l<r) {
	        if(a[l]%2==0 && a[r]%2==1) {
	            swap(a[l],a[r]);
	        }
	    }
	        
	}

    private static void swap(int i, int j) {
        // TODO Auto-generated method stub
        int temp;
        temp =i;
        i=j;
        j=temp;
    }
	

}
