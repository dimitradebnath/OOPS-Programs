import java.util.regex.*;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

  class Regex
	{

		public static void main(String[] args)
		{
			String str,n,ph,date;
			System.out.println("Hello   <<name>>,   We   have   your   full name   as   <<fullname>>   in   our   system.   your   contact   number   is   91­xxxxxxxxxx. Please,let   us   know   in   case   of   any   clarification   Thank   you   BridgeLabz   01/01/2016");
		String s ="Hello   <<name>>,   We   have   your   full name   as   <<fullname>>   in   our   system.   your   contact   number   is   91­xxxxxxxxxx. Please,let   us   know   in   case   of   any   clarification   Thank   you   BridgeLabz   01/01/2016";
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello  Enter <<name>>");
		n=sc.next();
		System.out.println("Hello  Enter <<fullname>>");
		str=sc.next();
		System.out.println("Hello  Enter Phone number");
		ph=sc.next();
		match obj = new match();
		match obj1 = new match();
		match obj2 = new match();
    match obj3 = new match();
		 String s1=obj.isname(s,n);


		String s2= obj1.isFullname(s1,str);


		String s3=obj2.Phno(s2,ph);

		String s4=obj3.date(s3);

		
    System.out.println(s4);


		}
	}

		class match{

	public static String isname(String s,String n) {
			String n1,s1;
			s1=s;
			n1=n;
    			String expression = "[<<a-zA-Z>>]*";
    			if (n1.matches(expression))
				   {
					String str2=s1.replace("<<name>>",n1);
					return str2;
					}

				else
					{System.out.println("error");
					return ("\0");}
			}

		public static String isFullname(String s,String str) {
			String str1,sn;
			sn=s;
			str1=str;
    			String expression = "[<<a-zA-Z>>]*";
    			if (str1.matches(expression))
				   {
					String str3=sn.replace("<<fullname>>",str1);
					return str3;
					}

				else{
						System.out.println("error");
						return ("\0");}
					}
		public static String Phno(String s,String ph) {
			String str1,ph1;
			ph1=s;
			str1=ph;
    			String expression = "[[91]{2}[0-9]{10}]*";
    			if (str1.matches(expression))
				   {
					String str4=ph1.replace("91­xxxxxxxxxx",str1);
					return str4;}

				else{
					System.out.println("error");
					return ("\0");}
			}
		public static String date(String s) {
			String i;
			i=s;

    			String expression ="^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$";
    			if (true)
				   {
					DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					 Date date = new Date();

					String str4=i.replace("01/01/2016",(sdf.format(date)));
					return str4;}

				else{
					System.out.println("error");
					return ("\0");}
			}
}
