package ARRAY_Package;

import java.util.Iterator;

public class Addition_of_two_Array {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4};
		int b[] = {5,6,7};
		int n=a.length;
		if(a.length<b.length)
		{
			n=b.length;
		}
		
		for(int i=0;i<n;i++) {
			try{
				System.out.println(a[i]+b[i]);
			}
					
			
		
		catch (Exception e) {
			System.out.println(b[i]);
		}
	}
	}
	
}
