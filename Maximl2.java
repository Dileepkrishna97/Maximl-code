import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Maximl2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String st=sc.next();
		int i=0;
		int j=0;
		int count=0;

		Set<Character> s1=new HashSet<Character>();
		
		while(i<st.length()&&j<st.length())
		{
			if(!s1.contains(st.charAt(j)))
			{
				s1.add(st.charAt(j));
				j++;
				
				System.out.println(s1);
				count=Math.max(count,j-i);
				
			}
			else
			{
				
				s1.remove(st.charAt(i));
				i++;
				System.out.println(s1);
			}
		}
		   System.out.println(count);	
	}	
				
}	