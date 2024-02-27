package interview;

public class diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5;i>=1;i--)
		{
			for(int s=5;s>i;s--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
				
			}
			System.out.println(" ");
		}
		for(int i=2;i<=5;i++)
		{
			for(int s=5;s>i;s--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
				
			}
			System.out.println(" ");
		}


	}

}
