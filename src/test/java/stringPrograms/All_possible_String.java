package stringPrograms;

import java.util.LinkedHashSet;

public class All_possible_String {

	public static void main(String[] args) {
		String s="xyxyxyxy";
  int start=s.length()/2;
  
  LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0; i<start; i++)
		{
			String res="";
			for(int j=0; j<s.length();j++) 
			{
			String sum=s.charAt(i)+""+s.charAt(j);
			set.add(sum);
			}
		}
		for(String str :set )
		{
			System.out.println(str);

			}


		}

	}


