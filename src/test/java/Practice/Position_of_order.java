package Practice;

import java.util.LinkedHashSet;

import javax.security.auth.callback.CallbackHandler;

public class Position_of_order {

	public static void main(String[] args) {


		String s="lohith";
		s=s.toLowerCase();

		//step=1 remove duplicate char of given string
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();

		//for(int i=s.length()-1;i>=0;i--)//Reverse order
		for (int i=0; i<s.length();i++)//forward` order 
		{

			set.add(s.charAt(i));
		}
		//step=2 compare each char of set with all the char given
		for(Character ch : set)
		{
			for(int i=s.length()-1;i>=0;i--) {
				if(ch==s.charAt(i))
				{
					System.out.println(ch+"="+(i+1));
					break;
				}
			}
		}
	}

}
