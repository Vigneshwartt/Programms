package interview;

public class primeo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=5,i,c=0;
		for(i=0;i<=no;i++)
		{
			if(no%i==0)
			c++;
			
		}
		if(c==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("composite");
		}

	}

}
