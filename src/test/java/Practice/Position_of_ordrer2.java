  package Practice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Position_of_ordrer2 {

	public static void main(String[] args) {
		 String s="aabbbcab";
		 
		 
		LinkedHashSet<Character> set=new LinkedHashSet<Character>(); 
		 
		 for(int i=0;i<s.length();i++) 
		 {
			 int count=1;
           for(int j=i+1; j<s.length();j++)
 		 {
			if(s.charAt(i)== s.charAt(j))
           {
				count++;
	            i++;            //this is use for removing the repetative character
           }
	     else 
	     {
	    	break;
	     }
	     }
	    System.out.println(s.charAt(i)+""+count);
}		
		 }
		
	

}

