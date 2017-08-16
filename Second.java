import java.util.regex.*;
import java.util.*;
import java.lang.*;
import java.text.*;
  
public class Second{
	public static void main(String args[])
	{  
		String str2=null;
		String str="<<name>>";
		Pattern pattern=Pattern.compile(str);
		
		Scanner sc=new Scanner(System.in);
		
		String str1="Hello <<name>>,We have your full name as <<fullname>> in our system.your contact number is 91xxxxxxxxxx.Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
		Matcher matcher=pattern.matcher(str1);
		
		System.out.println("Enter Your full name");
		String name=sc.nextLine();
	
		String[] FirstName=name.split("\\s+");
		
		System.out.println("Enter your phone number");
		String ph=sc.nextLine();
		
		
		Date date = new Date();
		String dd=new SimpleDateFormat("dd/MM/YYYY").format(date);	
	
		while(matcher.find())
		{
			
	str2=str1.replace("<<name>>",FirstName[0]).replace("<<fullname>>",name).replace("91xxxxxxxxxx",ph).replace("01/01/2016",dd);
		}
		
		System.out.println(str1);
		System.out.println("The string after modification becomes:------ ");
		System.out.println(str2);

    	}
} 
