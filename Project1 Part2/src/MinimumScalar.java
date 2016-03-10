import java.io.File;
import java.util.Arrays;  
import java.util.Collections;
import java.util.Scanner;
  
  
public class MinimumScalar {  
	private static Scanner sc;
        public static void main(String[] args) throws Exception {  
    	sc = new Scanner(new File("input.txt")); 
          
        int totalCases = Integer.parseInt(sc.nextLine());  
  
        for (int cases = 1; cases <= totalCases; cases++) {  
            int num = Integer.parseInt(sc.nextLine());  
            String[] one = new String(sc.nextLine()).split(" ");  
            String[] two = new String(sc.nextLine()).split(" ");  
            int arr1[] = new int[num];  
            for (int i = 0; i < num; i++) 
                arr1[i] = (Integer.parseInt(one[i]));
  
            Integer arr2[] = new Integer[num];  
            for (int i = 0; i < num; i++) 
                arr2[i] = (Integer.parseInt(two[i]));
            
            Arrays.sort(arr1);
            Arrays.sort(arr2, Collections.reverseOrder());  
            
            int answer = 0;
            for (int i = 0; i < num; i++) 
            	answer=answer + arr1[i] * arr2[i];
                
            System.out.println("Case #" + cases + ": " + answer );  
  
        }  
        sc.close();  
          
    }
    
}

