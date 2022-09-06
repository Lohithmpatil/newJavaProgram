package Practice;

import java.util.LinkedHashSet;

public class Remove_Dupicate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="indiaan"; //inda (ask interview this type print they will give input and output)
	       //i=2 n=2 a=1
			
			//step=1 create any set collection,add each character of given string in to set
			
			LinkedHashSet<Character> set=new LinkedHashSet<Character>();
			
			
			for(int i = 0; i < s.length() ; i++)
				 //i=0 0<5 1<5 2<5 3<5 4<5 5<5
			{
				set.add(s.charAt(i));// i n d i a
				
			}
             for(Character ch:set)
             {
            	 System.out.print(ch);
	}

}
}
