
//https://leetcode.com/problems/single-number/
import java.util.*; 
class SingleNumber 
{ 
     public static int singleNumber(int[] nums) {
        int ans = 0; // Initialise the number to zero to XOR the number
        for(int num : nums) // Iterate to the numbers
        {
            ans^= num; // XOR all the elements in the array
        }
        return ans;
    }

public static void main(String[] args) 
   { 
       int[] arr = {2,2,1};
       System.out.println(singleNumber(arr));
   } 
} 
