package array;

public class ArrayRearrangement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,6,7,9};
		
		//reaarangeArray(a);
		reverse(a);
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

	//reaarrange an array such that arr[i] = i
	
	public static void reaarangeArray(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			int pos = isElementPresent(arr,i);
			if(pos!=-1 && pos==i) {
				
			}
			else if(pos!=-1 && pos!=i) {
				
				int temp = arr[i];
				arr[i] = i;
				arr[pos] = temp;
			}
			
	
		}
	}

	public static int isElementPresent(int[] arr,int key) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key)
				return i;
		}
		return -1;
	}
	
	//reverse the array
	public static void reverse(int[] a) {
		int l=0;
		int r=a.length-1;
		
		while(l<r) {
			int temp = a[l];
			a[l] = a[r];
			a[r] = temp;
			l++;
			r--;
		}
	}
	
}
