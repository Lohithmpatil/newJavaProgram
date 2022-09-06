package Practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class NoOF_occrance {

	public static void main(String[] args) {

		String s="india";
		//i=2 n=2 a=1

		//step=1 create any set collection,add each charcter of given string in to set

		LinkedHashSet<Character> set=new LinkedHashSet<Character>();


		for(int i = 0; i < s.length() ; i++)
			//i=0 0<5 1<5 2<5 3<5 4<5 5<5
		{
			set.add(s.charAt(i));// i n d i a

		}
		//step=2 cmpare each character of set with all character given string  

		for(Character ch :set)//inda
		{//ch=a
			int count=0; //0 1

			for (int i = 0; i < s.length() ; i++)
		                    
			{ //i=0 0<5 1<5 2<5 3<5 4<5 5<5

				if(ch==s.charAt(i))
					//n==i,n==d,n==i,n==a
				{
					//step=3
					count++;
				}

			}
			//step=4
			System.out.print(ch+""+count);//emty string becuase of asci value





		}

	}

}
