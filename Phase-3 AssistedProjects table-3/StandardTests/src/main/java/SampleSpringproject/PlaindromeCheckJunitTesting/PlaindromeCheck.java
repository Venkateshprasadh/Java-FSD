package SampleSpringproject.PlaindromeCheckJunitTesting;

public class PlaindromeCheck 
{
	public String palindrome(int n)
	{
		 int r,sum=0,temp;    
		  //It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   return "yes palindrome number";    
		  else    
		   return "no not palindrome";    
	}
}
