//3.write a program to find minimum and maximum of an array.
//date 1-12-22
package thursdaylab;

import java.util.Scanner;

public class MinMaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count, max, min, i;
        int[]arr = new int[500];
   
        Scanner sc = new Scanner(System.in);
   
        System.out.println("Enter number of elements");
        count = sc.nextInt();
        System.out.println("Enter " + count + " elements");
         
        for(i = 0; i < count; i++) {
           arr[i] = sc.nextInt();
        }
   
        max = min = arr[0];
         
        for(i = 1; i < count; i++) {
            if(arr[i] > max)
                max = arr[i];
            else if (arr[i] < min)
                min = arr[i];
                
        }
        
        System.out.println("Largest Number : " + max);
        System.out.println("Smallest Number : " + min);
		

	}

}
