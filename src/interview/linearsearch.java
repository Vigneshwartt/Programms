package interview;

import java.util.Scanner;

public class linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int [] a= {2,43,15,32,11,87};
	Scanner sc=new Scanner(System.in);
	
	System.out.print("enter no");
	int no=sc.nextInt();
	boolean bg=false;
	for(int i=0;i<=a.length;i++)
	{
		if(no==a[i])
		{
			bg=true;
			break;
		}
	}
	if(bg==true)
	{
		System.out.println("binary search is found");
	}
	else
	{
		System.out.println("binary is not found");
	}

	}

}
