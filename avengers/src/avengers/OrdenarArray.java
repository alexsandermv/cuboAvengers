package avengers;

import java.util.Arrays;

public class OrdenarArray {

	    public static void main(String[] args) {
	        
	        int num[] = {100, 25, 68, 2, 36 , 1, 15, 18, 20};
	        
	        System.out.println(Arrays.toString(num));
	        Arrays.sort(num);    // ordena o array
	        for (int i : num) {
	            System.out.println(i);
	        }
	    }
	}

