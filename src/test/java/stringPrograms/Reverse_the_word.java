package stringPrograms;

public class Reverse_the_word {

	public static void main(String[] args) {
	String s="welcome to string";
	String [] str= s.split(" ");   //spilt methode we have to use the remove the space string
	
	for(int i=str.length-1;i>=0;i--)
	{
		System.out.print(str[i]+" ");
	}
	}

}
