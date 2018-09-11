package problems;
import java.util.Scanner;
public class probem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		
		int numag = in.nextInt();
		int counter =1;
		int[]  num = new int[numag];
		
		
		

		for(int i=0 ;i <numag ;i ++)
		{
			num[i]=in.nextInt();}
		
		if (numag==1)
		{
			System.out.println(1);
			
		}
		else if (numag==2)
		{ 
			if (num[0]==num[1])
		          { System.out.println(1);}
			   else if (!(num[0]==num[1])){System.out.println(2);}
		        	
		          
		
		
		// how to make groups 
	}
		
		else if ( numag >2)
		{
		for(int i=0 ;i <numag-1;i ++)
		{
			if ( !(num[i]== num[i+1]))
		{
			counter ++;
		}
			
			
		}
		
		System.out.println( counter);
	}
		
			
			
		
		
		

	}
}


