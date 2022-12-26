/*2.Find out the sum of all digits from an alpha numeric string. */
package thursdaylab;
import java.util.Scanner;
public class AlphaNumericString2212 {

	public static void main(String[] args) {
		String str;
		int sum=0;
		char ch;
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if((ch>=47)&&(ch<=57))
              {
	int n=Integer.parseInt(String.valueOf(ch));
     sum=sum+n;
               }
		}
System.out.println("total of digit from "+str+ " is "+sum);

//as well as like this
/*String str = "Hello 123";
        String string;
        int sum = 0;
        char ch;
        for (int i = 0; i < str.length(); i++) {

ch=str.charAt(i);
if((ch>=48)&&(ch<=57)){
    int a=Integer.parseInt(String.valueOf(ch));
    sum=sum+a;

            }

        }
        System.out.println(sum);*/
	}

}
