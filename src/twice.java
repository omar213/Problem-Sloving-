
import java.util.Arrays;
import java.util.Scanner;

public class twice {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		
	String first =in.nextLine();
	int dis=0;
	
	String temp="";
	for(int i =0; i <first.length();i++)
	{
		 if (!(temp.contains(String.valueOf(first.charAt(i)))))
		 {
			 temp+=first.charAt(i);
			 dis++;
		 }
		 else
		 {continue ;}
		
		
		
		
	}
	
	if(dis %2==1)
	{
		
		System.out.println("IGNORE HIM!");
	}
	else
	{
		
		System.out.println("CHAT WITH HER!");
	}
		
		

		
		
	}
}
	



