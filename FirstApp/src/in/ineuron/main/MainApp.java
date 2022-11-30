package in.ineuron.main;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
   /* String s="iNeuron";
    String out="";
    for (int i=0;i<s.length()-1;i++)
    {
    	//System.out.print(s.charAt(i));
    	//System.out.print(" -");
    	out=out+s.charAt(i);
    	//System.out.println();
    	//  System.out.println(out);
    }
    System.out.print(out);
	}
	*/
		//Scanner scan=new Scanner(System.in);
	//	String s=scan.nextLine();
		//System.out.println("You Entered---->" +s);
		
		//String s="radhakrishnan";
		String snew="";
		
	//	System.out.print(s.length());
		//System.out.print(s.charAt(s.length()-1));
		
		/* for (int i=s.length()-1;i>=0;i--)
		{
			//System.out.println(i);
			System.out.print(snew+s.charAt(i));
			
		}
		
		
		
		String sm="Java Rocks!";
	System.out.print(sm.length());
	
	System.out.print(sm.charAt(0));
		
		
		
		System.out.print("Enter String - ");
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String newString="";
		for (int i=s.length()-1;i>=0;i--)
		{
			newString=newString+s.charAt(i);
		}
		
		System.out.println("Reversed String is ....");
		System.out.println(newString);
		
		//System.out.print("Checking for Palindrome...");
		if (s.equalsIgnoreCase(newString))
				
		{
			System.out.print("You entered Palindrome");
		}
		else 
		{
			System.out.print("Not Palindrome");
		}
		*/
		
		String s1="Race";
		String s2="1Care";
		System.out.println("You entered "+s1);
		System.out.println("You entered "+s2);
		
		
		char[] sarray1=s1.toLowerCase().toCharArray();
		Arrays.sort(sarray1);
		System.out.println(sarray1);
		
		char[] sarray2=s2.toLowerCase().toCharArray();
		Arrays.sort(sarray2);
		System.out.println(sarray2);
		
		if(Arrays.equals(sarray1, sarray2))
		{
			System.out.println("Anagram");
		}
		else
			System.out.println("Not Anagram");
		
	}
}
