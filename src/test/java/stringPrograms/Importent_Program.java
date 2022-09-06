package stringPrograms;

public class Importent_Program {

	public static void main(String[] args) {
		String s="welcome to tyss banglr";

		String str[]=s.split(" ");    //here swapping no
		String temp=str[0];
		str[0]=str[str.length-1];
		str[str.length-1]=temp;

		for(int i = 0; i < str.length; i++)  //read all the data in string array
		{
			String s1=str[i];
			if(i==0 || i==(str.length-1))     //here first index and last index only reversing
			{
				for(int j =s1.length()-1; j>=0; j--)  //here reversing the string
				{
					System.out.print(s1.charAt(j));  // here print the reverse string
				}
				System.out.print(" ");  //this statement used space between the word
			}

			else
			{
				System.out.print(s1+" ");
			}
		}
	}
}

