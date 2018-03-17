package demo;

public class Account {
	
	int counter;

	public Account() {
		counter=0;
	}
	
	public double interest(int amount) 
	{
		if(amount>=0 && amount<=1000) {
			amount=0;
		}
		else if(amount>=1001 && amount<=5000) {
			amount=(int) (amount*((2.5)/100));
		}
		else if(amount>=5001 && amount<=10000) {
			amount=(int) ((amount*5)/100);
		}
		else if(amount>10000) {
			amount=(int) ((amount*8)/100);
		}
		return amount; 
	}
	
	public int interestType(double interest) 
	{
		if(interest==0.0) {
			counter++;
		}
		return counter;
	}
}
