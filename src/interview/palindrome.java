package interview;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashSet<String> t1=new HashSet<String>();
	t1.add("a");
	
	t1.add("by");
	t1.add("c");
	t1.add("a");
	t1.add("c");
	Iterator<String> itr=t1.iterator();
	while(itr.hasNext())
	{
		//System.out.println(itr.next());
		System.out.println(itr.next());
	}
	}

}
