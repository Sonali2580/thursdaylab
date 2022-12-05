//1.write a program to print reverse of an array.
//date 1-12-22
package thursdaylab;
import java.util.Scanner;

public class ReverseOfArray {

	public static void main(String[] args) {
		int arr[]=new int[10];
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the 5 elements of array");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		//to print values
		System.out.println("here are the  5 elements");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println();
		//reverse array
		System.out.println("this are the reverse array elements");
		//loop through the array in reverse order
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
			
		}

	}

}
// added particular size in that program before initialise 5 ,use need to do that ,use linear search exmple