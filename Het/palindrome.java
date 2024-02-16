import java.util.Scanner;
public class Palindrome
{
	public static Void main(String[] args)
	{
		int flag=0;
		int start=0;
		int end=s.length();
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		while(start<=end)
		{	
			if(s.charAt(start)!=s.charAt(end)){
			flag=1;
			break;
		}
		start++;
		end--;
		}
		if(flag==0)
		{
			System.out.println("The String is Palindrome ");
		}
		else
		{
			System.out.println("The String is not Palindrome");
		}		

	}

}