package stringPrograms;

public class Sony2 {

	public static void main(String[] args) {
		String s="my name is praveen";
		//op ne evar ps iemanym
		
		String []str=s.split(" ");
		String rev3="";
		//for(int i=str.length-1;i>=0;i--)
		{
			//String rev="";
			//rev=str[i];
			//System.out.println(rev);
			//System.out.print(str[i]+" ");
		}
		for(String lp:str)
		{
			String rev1="";
			for(int i=lp.length()-1;i>=0;i--)
			{
				rev1=rev1+lp.charAt(i);
			}
			rev3=rev3+rev1+" ";
			for(int i=rev3.length()-1;i>=0;i--)
			{
				lp=lp+rev1;
			}
			System.out.println(lp);
		}
		
		
		System.out.println(rev3);
		
             
	}

}
