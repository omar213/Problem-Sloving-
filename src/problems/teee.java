package problems;

import java.util.Scanner;

public class teee {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=0;
		Scanner in = new Scanner(System.in);
            int ro=0,co=0;

		int [][] my = new int[5][5];

		for(int i =0 ; i <5;i++)
		{ 
			for(int k=0; k<5;k++)
			{ 
				int p = in.nextInt();
				my[i][k]=p;
				}
		}
	///
		if(my[2][2]==1)
		{
			int w =1 ;
			System.out.println(w);
		}
		//////
	outer :{
		for(int i =0 ; i <5;i++)
		{ 
			for(int k=0; k<5;k++)
			{ 
				if(my[i][k]==1)
				{ ro=i;
				co=k;
				break outer ;
				
				}
				}// end of outer loop 
		}
		}
	
		System.out.println(ro +" "+co);
		System.out.println(" heey");
		
		while( my[2][2]==0)
		{ if(ro<2){  ro++; counter++;}
		else{co--; counter ++;}
		  if(ro>2){  ro--; counter  ++;}
		  else{co++; counter ++;}
		  
		  
		}
		System.out.println("tteey ");
		System.out.println(counter);
		
		
	}
}
	



