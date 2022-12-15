//WAP to print reverse of string.
package thursdaylab;

public class ReverseString {

	public static void main(String[] args) {
		String str= "Javascript", rev="";
        char ch;
        
      System.out.println(str);
      //Example word
        
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        rev= ch+rev; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ rev);

	}

}

