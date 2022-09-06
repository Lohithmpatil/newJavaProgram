package Practice;

public class printAll_the_PossibleString_in_GIvenString {

	public static void main(String[] args) {
		
		String s="welcome";                 //step2
		for(int i =0;i<s.length();i++)   //for(int i =0;i<s.length();i++) 
		{                                //for(int j=i; j<s.length(); j++)
			String res="";               //System.out.println(s.substring(i, j));
		for(int j=i; j<s.length(); j++)  
		{                                
			res=res+s.charAt(j);           
		//System.out.println(res);    //here print all the possible string
		
		//interview ask i wont to 2 character substring
		if(res.length()==2)
			System.out.println(res); 	//here print only 2character substring
		}
	}
		}
	}
//rove duplicate sub string in two  charcter
//create hash set<string>
//after if statment put set.add(res)
//syso(res)
