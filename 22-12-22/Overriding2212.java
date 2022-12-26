/*1.Write program to show method overriding using a Bank class as super class and create some sub class accordingly. Write at least 
 * common property (method) and change the implementation in subclass. Display the implementation of each subclass with object.
 * */
package thursdaylab;
class Kanb //this is parent class
{
	int getRateOfIntrest()
	{
		return 0;
	}
}

//this is our derived class
//we'll be inheriting and overriding parent class method

class PNB extends Kanb
{
	int getRateOfInterest()
	{
		return 23;
	}
}

//again a derived class
//and we are inheriting and overriding the parent class method 

class BC extends Kanb
{
	int getRateOfInterest()
	{
		return 19;
	}
}
//derived class
//inheriting and overriding parent class method again
class YES extends Kanb
{
	int getRateOfInterest()
	{
		return 8;
	}
}

public class Overriding2212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PNB pnb = new PNB();
		System.out.println("Rate of Interest for PNB is:"+pnb.getRateOfInterest()+"%");
		BC bc = new BC();
		System.out.println("Rate of Interest for BC is: "+bc.getRateOfInterest()+"%");
		YES yes = new YES();	
		System.out.println("Rate of Interest for YES is: "+yes.getRateOfInterest()+"%");

	}

}
