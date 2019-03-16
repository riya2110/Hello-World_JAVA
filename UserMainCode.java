import java.io.*;
import  java.util.*;

class UserMainCode
{
    static int getCodeThroughStrings(String input1)
	{
		String s[]=input1.split(" ");
		int len = s.length;
		int slen,rem=0,sum=0;
		for(int i=0;i<len;i++)
		{
			slen=s[i].length();
			sum=sum+slen;
		}
		int num=sum;
		int temp;
		sum=0;
		while(num>9)
		{ temp=num;
		  sum=0;
			while(temp!=0)
			{
				rem=temp%10;
				sum=sum+rem;
				temp=temp/10;
			}
		  num=sum;
		}
		
		return num;
	}

 
	public static void main(String[] args)
	{
	   String str;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		int pin;
		pin=getCodeThroughStrings(str);
		System.out.printf("%d",pin);
	}
}