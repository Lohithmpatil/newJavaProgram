package stringPrograms;

public class Reverse_NO {

	public static void main(String[] args) {
	   int i= 1234,rev = 0, r;
	   while(i>0)
	   {
		   r=i%10;
		   rev=rev*10 + r;
		   i=i%10;
	   }
	   
     System.out.print(rev);
	}

}
