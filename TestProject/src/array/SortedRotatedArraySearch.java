package array;

public class SortedRotatedArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {3,4,5,1,2};
		
		int key = 2;int low=0;int high=a.length-1;
		int sum=8;
		int pivot = findPivot(a);
		if(pivot==-1) {
			System.out.println("found at "+binarySearch(a,key,low,high));
		}
		
		else {
		 
		 if(key<a[0]) {
			 System.out.println("found at "+binarySearch(a, key,pivot+1,high));
		 }
		 else {
			 System.out.println("found at "+binarySearch(a, key, low, pivot));
		 }
		}
		
		System.out.println(isSumPair(a, sum));
	}

	public static int findPivot(int[] a) {
		int pivot;
		for(int i=0;i<a.length;i++) {
			if(a[i]>a[i+1])
				return i;
		}
		return -1;
	}
	
	public static int binarySearch(int[] a,int key,int low,int high) {

		while(low<=high) {
			int mid = (low+high)/2;
			
			if(a[mid]==key)
				return mid;
			
			else if(key<a[mid])
				high = mid-1;
			
			else
				low = mid+1;
		}
		return -1;
	}
	
	public static boolean isSumPair(int[] a,int sum) {
		int pivot = findPivot(a);
		int l=pivot;int r=pivot+1;
		while(l!=r) {
			if(a[l]+a[r]==sum) {
				return true;
			}
			 if(a[l]+a[r]<sum) 
				l=(l+1)%a.length;
			else
				r=(a.length+r-1)%a.length;
		}
		return false;
	}
}
