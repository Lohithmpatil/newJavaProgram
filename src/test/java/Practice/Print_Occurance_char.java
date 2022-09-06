package Practice;

public class Print_Occurance_char {

	public static void main(String[] args) {
		String s="a2b3c4";
		        //01234
		for(int i = 0 ; i<s.length();i=i+2)//here also passing i=i+2
		{ //i=0 0<5, i=2 i=4 4<5 6<5
			int n =s.charAt(i+1)-48;
			
			
			while(n>0)  //2>0 1>0 0>0,,,3>0 2>0 1>0 0>0,,, 4>0 3>0 2>0,1>0,0>0
			{
				System.out.print(s.charAt(i));//aabbbcccc
				n--;
			}
			//i=i+2;//2,4,6
		}
	}

}
