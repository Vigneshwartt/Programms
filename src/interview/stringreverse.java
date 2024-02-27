package interview;

public class stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="vikkineshwar";
		int l=name.length();
		String temp="";
		for(int i=l-1;i>=0;i--)
		{
			char chr=name.charAt(i);
					temp=temp+chr;
			
		}
			
		System.out.println(temp);
	}

}
