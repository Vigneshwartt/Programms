package interview;

import java.util.Scanner;

public class pronicno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int no=sc.nextInt();
		int a=0,b=0;
		boolean bg=false;
		
		for(int i=0;i<no;i++)
		{
			if(i*(i+1)==no)
			{
				bg=true;
				a=i;
				b=i+1;
				break;
				
			}
			
		}
		if(bg=true)
		{
			System.out.println(no+"pronic no");
			System.out.print(a+"*"+b+"="+no);
		}
		else
		{
			System.out.println("not pronic no");
		}
		

	}

}
