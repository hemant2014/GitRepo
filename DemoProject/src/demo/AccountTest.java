package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AccountTest {

	public static void main(String[] args) throws IOException
	{
	String studentId;
	int largestNumber = 0,counter=0,high=0;
	double interest=0.0;
	double val[],max,min,avg=0.0,total=0.0;
	ArrayList<Integer> num;
	Account obj=new Account();
		System.out.println("Welcome to calculater to know the interest according to your amount");
		System.out.println("Please enter your student id : ");
		
		Scanner sc=new Scanner(System.in);
		studentId=sc.next();
				
		 num= new ArrayList<Integer>();
		 String str=studentId.replaceAll("[\\D]", "");
		 for(char c : str.toCharArray()){
		     if(Character.isDigit(c)){
		         int value = Character.getNumericValue(c);
		         num.add(value);
		     } 
		 }
		 Set<Integer> hs = new HashSet<Integer>();
		 hs.addAll(num);
		 num.clear();
		 num.addAll(hs);
		 Collections.reverse(num);
		 high=num.get(0);
		 val = new double[high];
		 for(int i=1;i<=high;i++) {
			 System.out.println("Enter the amount for account number "+i+" : ");
			 
			 interest=obj.interest(sc.nextInt());
			 System.out.println("The interest for account number "+i+ " is $"+interest);
			 counter=obj.interestType(interest);
			 val[i-1]=interest;
		 }
		  System.out.println(val);
		 max=val[0];
		 min=val[0];
		 for(double d : val) {
			 if(max < d) {
				  max=d;
			 }
			 if(min > d) {
				  min=d;
			 }
			 total += d;
		 }
		 avg=(total/high);
		 System.out.println("-----------------interest\n");
		 System.out.println("Deails------------------------");
		 System.out.println("Total Interest: $"+total);
		 System.out.println("Lowest Interest: $"+min);
		 System.out.println("Highest Interest: $"+max);
		 System.out.println("Average Interest: $"+avg);
		 System.out.println("Number of accounts with no interest: "+counter);
		 
		System.out.println("Thank you for using our calcuation service...!!!!");
	}
}
