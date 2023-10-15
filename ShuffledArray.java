package strings;
import java.util.*;
import java.io.*;
public class ShuffledArray 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7};
		System.out.println("Shuffled Array");
		int b[]=new int[a.length];
		for(int i=0;i<a.length-1;i++)
		{
			b[i]=a[i+1];
			
		}
		b[a.length-1]=a[0];
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		
	}

}
