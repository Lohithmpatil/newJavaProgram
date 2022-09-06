package stringPrograms;

import java.util.LinkedHashSet;

public class No_occurance_ {

	public static void main(String[] args) {
	String s="aabbabc";         //o/p a2b3a1b1c1
	
	
	for(int i=0; i<s.length();i++)
	{
		int count=1;
		for(int j=i+1;j<s.length();j++)
		{
			if(s.charAt(i)==s.charAt(j))
			{
			count++;
			i++;
		}
		else
		{
			break;
			
		}
	}
	System.out.print(s.charAt(i)+""+count);
	}
	}
}
