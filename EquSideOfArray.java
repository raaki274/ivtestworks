package ivprep;

import java.util.stream.IntStream;

public class EquSideOfArray {

	    public static int checkIfEqualOption1(int[] arr){

//	        int sumTotal=0;
//	        for (int i=0; i < arr.length; i++){ // O(arr.length)
//	            sumTotal += arr[i];
//	        }
	    	
	    	int sumTotal = IntStream.of(arr).sum();

	        int sumRight = 0;
	        int sumLeft=0;
	        int result = -1;
	        for (int i=1; i < arr.length-1; i++){ // O(arr.length)
	            sumLeft += arr[i-1];
	            sumRight = sumTotal - arr[i] - sumLeft;
	            if (sumRight == sumLeft){
	                result = arr[i];
	                break;
	            }
	        }
	        return result;
	   }


	   public static void main(String[] args) {

	     int[] numbers = {1,2,2,9,3,2,4,8};
	     System.out.println("Array numbers:");
	     for (int i=0; i < numbers.length; i++){
	          System.out.print(numbers[i] + " ");
	     }
	     System.out.println("\n");
	     System.out.println("Result: "+checkIfEqualOption1(numbers));
	   }

	}