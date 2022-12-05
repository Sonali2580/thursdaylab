//2.write a program to print all negative numbers in an array.
//date 1-12-22
package thursdaylab;

import java.util.Scanner;

public class NegativeInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Size, i;	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nPlease Enter the NEG Array size  : ");
		Size = sc.nextInt();
		int[] Neg_arr = new int[Size];
		
		//System.out.format("\nEnter NEG Array %d elements : ", Size);
		System.out.println("\n Enter negative array elements "+Size);
		for(i = 0; i < Size; i++) 
		{
			Neg_arr[i] = sc.nextInt();
		}
		
		System.out.print("\nList of Negative Numbers in NEG Array : ");
		for(i = 0; i < Size; i++) 
		{
			if(Neg_arr[i] < 0) {
				//System.out.format("%d  ", Neg_arr[i]);
				System.out.print(Neg_arr[i]);
			}
		}


	}

}
