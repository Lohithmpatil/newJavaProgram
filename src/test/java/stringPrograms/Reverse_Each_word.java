package stringPrograms;

public class Reverse_Each_word {

	public static void main(String[] args) {
		String s="lohith m patil";
		String []str= s.split(" ");
		String rev="";

		for(String w:str)
		{
			String rev1="";
			for(int i=w.length()-1 ; i>=0 ;i--)
			{
				rev1=rev1+w.charAt(i);
			}
			rev=rev+rev1+" ";
		}
		System.out.println(rev+" ");
	}

}
