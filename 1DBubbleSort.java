import java.util.*;
//import java.util.lang.*;
import java.util.Scanner;
//removed for extraneous use
//re-introduced scanner allows user input

public class BubbleSort {
 
  //opens bubble sort solution
        public static void main(String[] args) {
               
          
          int intArray[] = new int[]{24,15,7,97,34,65,21,43};
               
              /*  System.out.println("Array Before Bubble Sort");
                for(int i=0; i < intArray.length; i++){
                        System.out.print(intArray[i] + " ");
                }     
                bubbleSort(intArray);
               
                System.out.println("");
				lines 15-22 removed for post improvement    */
                               
                System.out.println("Array After Bubble Sort");
                for(int i=0; i < intArray.length; i++){
                        System.out.print(intArray[i] + " ");
						}
						}
        	
			private static void bubbleSort(int[] intArray) {
                 
				 //sorting algorithm in effect here
				     
                int n = intArray.length;
                int temp = 0;
               
			   //recursive algorithm to sort according to cardinality
			   
                for(int i=0; i < n; i++){
                        for(int j=1; j < (n-i); j++){
                               
                          if(intArray[j-1] > intArray[j]){
                                     
                                   temp = intArray[j-1];
                                   intArray[j-1] = intArray[j];
                                   intArray[j] = temp;
					}
                             
			}
		}
	}
}
