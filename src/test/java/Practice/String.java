package Practice;

import java.util.LinkedHashSet;

public class String {


	public static void main(java.lang.String[] args) {
		String s= "whatsaappbasedsolutionsa";
		//String[] str=s.split(" ");
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i))
		}
		int count=0;
				for(Character ch:set)
				{
					for(int i=ch.length()-1;i>=0;i--)
					{
						if(ch==CharAt(i))
						{
							count++;
						}
							System.out.println(ch+" "+(i+1));

					}
				}
	}
}
