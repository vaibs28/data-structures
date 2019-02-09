package com.vaibhav.string;

public class ReplaceSpaces {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "hello world abc";
        
        char[] charArray = s.toCharArray();
        
        for(int i=0;i<charArray.length;i++) {
            if(charArray[i] == ' ') {
                charArray[i] = '%';
                
                char temp1 = charArray[i+1];
                char temp2 = charArray[i+2];
                
                charArray[i+1] = '2';
                charArray[i+2] = '0';
                
                
            }
        }
        
       s = new String(charArray);
       System.out.println(s);
    }

}
