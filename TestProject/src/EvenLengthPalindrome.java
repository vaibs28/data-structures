//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class EvenLengthPalindrome {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();                 // Reading input from STDIN
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        // Write your code here
        while(t>0){
            int n = s.nextInt();
            Integer i = new Integer(n);
            String str = i.toString();
            System.out.println(firstEvenLengthPal(str));
            t=t-1;
        }
    }
    
    public static String firstEvenLengthPal(String n){
      String res="";String rev="";
      for(int i=n.length()-1;i>=0;i--){
          rev+=n.charAt(i);
      }
      res=n+rev;
      return res;
    }
}
