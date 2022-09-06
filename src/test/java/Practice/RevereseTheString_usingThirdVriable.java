package Practice;

public class RevereseTheString_usingThirdVriable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="india";
		         //01234
		String rev="";
		
		
		
		for(int i=s.length()-1;i>=0;i--)//""/a,ai,aid,aidni
		{     //i=5-1=4 4>=0 3>=0 2>=0 1>=0 0>=0 -1>=0
			
			
			rev=rev+s.charAt(i);//"",+a.a+i,ai+d,aid+a,aidn+i,aidni
		}
		System.out.println(rev);
		
	}

}
