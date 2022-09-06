package Practice;

public class Segrssion_of_Alph_num_specil {

	public static void main(String[] args) {
		
		String s="b@2xAB3y&";
		String al="";
		String num="";
		String sp="";
		
		for(int i = 0 ; i<s.length(); i++)
{
	  if(s.charAt(i)>='a' && s.charAt(i)>='z' || s.charAt(i)>='A' && s.charAt(i)>='Z')
	  {
		  al=al+s.charAt(i);
	  }
	  else if (s.charAt(i)>=48 && s.charAt(i)<=57)
{
		num=num+s.charAt(i);
	}
else
{
	sp=sp+s.charAt(i);
}
}
		System.out.println(al);
		System.out.println(num);
		System.out.println(sp);
	}

}
