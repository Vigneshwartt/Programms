package interview;

public class secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,7,9,6,67,99,88,5};
int first=0;
int second=0;
int i;
for(i=0;i<arr.length;i++)
{
if(arr[i]>first)
{
	
	second=first;
	first=arr[i];
}
else if(arr[i]>second)
{
	second=arr[i];
}
}
System.out.println(first);
System.out.println(second);
}
}