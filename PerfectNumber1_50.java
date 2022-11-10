package thursdaylab;
import java.util.Scanner;

public class PerfectNumber1_50 {
	public static void main(String[] args) {
		int i,j,sum=0;
	
	for(i=1;i<=50;i++)
	{
		sum=0;
		for(j=1;j<i;j++)
		{
			if(i%j==0)
			
				sum=sum+j;
			
			
			
		}
		if(i==sum)
			System.out.println(sum);
	}

}
}
