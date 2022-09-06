package ARRAY_Package;

public class program2 {

	public static void main(String[] args) {
		
		String s="abc";
		s=s+"xyz";   //o/p= axbycz                i/p=aabb
		                                        //o/p=abab  same program
		//a b c x y z
		//0 1 2 3 4 5
		
		int n=s.length()/2;
		for(int i=0;i<n;i++)
		{
	      
			 System.out.println(s.charAt(i)+""+s.charAt(i+n));
		}
	}

}
