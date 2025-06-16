package TestNG;

import java.util.StringTokenizer;

public class Calculation {  
    
	/**
	 * Method finds maximum in given array
	 * 
	 * @param arr - integer array (arbitrary length)
	 * @return maximum number of array
	 */
    public static int findMax(int arr[]){  
        int max=0;  
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
        }  
        return max;  
    }  
    
    /**
     * Method calculates the cube of given number.
     * 
     * @param n - integer number
     * @return cube of given number
     */
    public static int cube(int n){  
        return n*n*n;  
    }  

    /**
     * Method reverses given words.
     * 
     * @param str - words to be reversed
     * @return reverse words
     */
    public static String reverseWord(String str){  
  
        StringBuilder result=new StringBuilder();  
        StringTokenizer tokenizer=new StringTokenizer(str," ");  
  
        while(tokenizer.hasMoreTokens()){  
        StringBuilder sb=new StringBuilder();  
        sb.append(tokenizer.nextToken());  
        sb.reverse();  
  
        result.append(sb);  
        result.append(" ");  
        }  
        return result.toString();  
    }  
    
    /**
     * The method calculates base to the power of exponent.
     * @param base
     * @param exponent
     * @return base to the power of exponent
     */
    public static int toThePowerOf(int base, int exponent) {
    	int result = 0;
    	for(int i = 0; i <= exponent; i++) {
    		result *= base;
    	}
    	return result;
    }
}  
