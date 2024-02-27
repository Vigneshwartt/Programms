package interview;

public class sumofpairs {
	static void findpairs(int array[],int no)
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]+array[j]==no)
				{
					System.out.println(array[i]+"+"+array[j]+"="+no);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findpairs(new int[] {4,2,3,5,1,8},10);
		findpairs(new int[] {3,2,55,12,10,3},65);
		

	}

}
