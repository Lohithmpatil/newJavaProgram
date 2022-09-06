package Practice;

import java.util.LinkedHashSet;

public class Print_Duplicate_Word {

	public static void main(String[] args) {
		String s="welcome to tyss welcome";//my note we arae using lenth varaiable not lenth methode andchange the collrction as string and first split methode wiil add the return type is arrya of string 
		 String[] str=s.split(" ");

		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		
		for(int i = 0; i < str.length ; i++)
			
		{
			set.add(str[i]);// i n d i a
			
		}
		//step=2 cmpare each character of set with all character given string  
		
		for(String word :set)
		{
			int count=0; //0 1
			
			for (int i = 0; i < str.length ; i++)
			{ 
				
				if(word.equals(str[i]))
			
				{
					//step=3
				count++;
				}
				
			}
			//step=4
			if(count>1)
				System.out.println(word+" ");
}

	}

}
