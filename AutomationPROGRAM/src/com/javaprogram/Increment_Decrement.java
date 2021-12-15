package com.javaprogram;

public class Increment_Decrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int i = 10;
           i = 20;
           
    	   int j = i++;
    	   
    	   System.out.println(" The value of i is" + i);
    	   
    	   System.out.println("the value if j is" + j);
    	   
    	   
           int k = ++j;
           
           System.out.println("the latest value of k is :" + k);
           System.out.println(" the lates value of j is :" +j);
           
           int l = k++ + ++k;
           
           System.out.println(" the value of l is " + l);
           System.out.println(" the value of k is " + k);
           
           int m = l++;
           int n = ++k + m++ - i-- - --i - --k;
           System.out.println(i);
           System.out.println(j);
           System.out.println(k);
           System.out.println(l);
           System.out.println(m);
           System.out.println(n);
        
	}

}
