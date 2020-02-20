package aanjali;


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
		char ch[]=st.toCharArray();

		Set<Character> s1=new HashSet<Character>();
		
		while(i<ch.length&&j<ch.length)
		{
			if(!s1.contains(ch[j]))
			{
				s1.add(ch[j]);
				j++;
				
				
				count=Math.max(count,j-i);
				
			}
			else
			{
				
				s1.remove(ch[i]);
				i++;
				
			}
		}
		   System.out.println("length of smallest substring with maximum number of distinct characters is"+" "+ count);	
	}	
				
}	
		
		
		
		
		

	



		
		
		
		
		
		
		