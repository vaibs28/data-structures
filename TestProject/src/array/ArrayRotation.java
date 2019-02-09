package array;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,2,3,4,5,6,7};
		int d=2;
		//rotateArray(a,a.length,d);
		System.out.println("Method1");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println("\n"+"Method2");
	
		rotate(a, a.length, d);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		
	}
	
	public static void rotateArray(int[] a,int n,int d) {
		int[] temp = new int[d];
		for(int i=0;i<d;i++) {
			temp[i] = a[i];
		}
		
		for(int i=0;i<n-d;i++) {
			a[i]=a[i+d];
		}
		int j=0;
		for(int i=(n-d);i<n;i++) {
			a[i]=temp[j++];
		}
	}
	
	public static void rotate(int[] a,int n,int d) {
		for(int i=0;i<d;i++) {
			int temp=a[0];
			int j;
			for( j=0;j<n-1;j++) {
				a[j]=a[j+1];
			}
			a[j]=temp;
		}
	}

}
