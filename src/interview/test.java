package interview;
import java.util.*;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name");
		String a=sc.next();
		System.out.println(a);
	    String temp=" ";
	    int l=a.length();
	    int count=0;
	    int add=0;
		for(int i=0;i<a.length();i++)
		{
			if('a'==a.charAt(i)||'e'==a.charAt(i)||'i'==a.charAt(i)||'o'==a.charAt(i))
			{
				count++;
				
			}
			else {
				add++;
			}
			
		}
		
		System.out.println(count);
		System.out.println(add);
	}

}
