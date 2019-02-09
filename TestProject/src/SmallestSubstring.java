import java.util.LinkedHashSet;

public class SmallestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s = "AABBBCBB";
      System.out.println(smallesteSubstr_maxDistictChar(s));
	}

	
	static int max_distinct_char(String str, int n){
		 
	    int count[] = new int[256];
	     
	    for (int i = 0; i < n;  i++)
	        count[str.charAt(i)]++;
	     
	    int max_distinct = 0;
	    for (int i = 0; i < 256;  i++)
	        if (count[i] != 0)      
	            max_distinct++;     
	     
	    return max_distinct;
	}
	
	static String getSubstr(String s,int i,int j) {
		String str="";
		for(int z=i;z<j;z++) {
			str+=s.charAt(z);
		}
		return str;
		
	}
	 
	static int smallesteSubstr_maxDistictChar(String str){
	 
	    int n = str.length();     
	 
	    int max_distinct = max_distinct_char(str, n);
	    int minl = n;   
	     
	    for (int i=0 ;i<n ;i++){
	        for (int j=0; j<n; j++){
	            String subs =  getSubstr(str, i, j);
	            int subs_lenght = subs.length();
	            int sub_distinct_char = max_distinct_char(subs, subs_lenght); 
	             
	            if (subs_lenght < minl && max_distinct == sub_distinct_char){
	                minl = subs_lenght;
	            }
	        }
	    }
	    return minl;
	}
	 
}
