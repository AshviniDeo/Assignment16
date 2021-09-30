package bridgeLabz;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to add :");
        int number = scanner.nextInt();
        int[] array = new int[number];
        for(int i =0; i<number; i++) {
        	System.out.println("Enter number");
        	int num = scanner.nextInt();
        	array[i] = num;
        }
        System.out.println("Array before sort");
       for(int i=0; i<array.length; i++) {
    	   System.out.println( array[i]);
       }
       for (int i = 0; i < number-1; i++) {
           for (int j = 0; j < number-i-1; j++) {
               if (array[j] > array[j+1])
               {
                   
                   int temp = array[j];
                   array[j] = array[j+1];
                   array[j+1] = temp;
               }
          }
       }
      
        System.out.println("Array aftr sort:");
        
        for(int i=0; i<array.length; i++) {
     	   System.out.println(array[i]);
        }
	}

}
