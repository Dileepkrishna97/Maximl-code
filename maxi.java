package aanjali;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.xml.stream.events.Characters;

public class Maximl {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String st=sc.next();
		char ch[]=st.toCharArray();
		
		Set<Character> s1=new HashSet<Character>();
		for(int i=0;i<ch.length;i++)
		{
			s1.add(ch[i]);
			
			
		}
		System.out.println(s1);
		System.out.println(s1.size());
		for(int j=1;j<=s1.size();j++)
		{
			System.out.println("substrings of length"+" "+j+"is"+j);
		}
		for(int k=s1.size()+1;k<=st.length();k++)
		{
			System.out.println("substrings of length"+k+"is"+s1.size());
		}
		

	}

}
