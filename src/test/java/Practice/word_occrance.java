package Practice;

import java.util.LinkedHashSet;

public class word_occrance {

	public static void main(String[] args) {
		
		String s="welcome to tyss welcome";//my note we arae using lenth varaiable not lenth methode andchange the collrction as string and first split methode wiil add the return type is arrya of string 
		 String[] str=s.split(" ");
	      
			 
			//step=1 create any set collection,add each charcter of given string in to set
			
			LinkedHashSet<String> set=new LinkedHashSet<String>();
			
			
			for(int i = 0; i < str.length ; i++)
				
			{
				set.add(str[i]);// i n d i a
				
			}
			//step=2 cmpare each character of set with all character given string  
			
			for(String word :set)//inda
			{//ch=a
				int count=0; //0 1
				
				for (int i = 0; i < str.length ; i++)
				{ //i=0 0<5 1<5 2<5 3<5 4<5 5<5
					
					if(word.equals(str[i]))
					//n==i,n==d,n==i,n==a
					{
						
						//step=3
					count++;
					}
					
				}
				//step=4
				System.out.println(word+""+count);//emty string becuase of asci value
				
				
				
				
				
			}
	}

}
