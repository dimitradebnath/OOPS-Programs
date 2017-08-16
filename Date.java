import java.util.regex.*;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

  class Dat
	{
		
		public static void main(String[] args)
		{
			String str,n,ph,date;
			System.out.println("Hello   <<name>>,   We   have   your   full name   as   <<fullname>>   in   our   system.   your   contact   number   is   91­xxxxxxxxxx. Please,let   us   know   in   case   of   any   clarification   Thank   you   BridgeLabz   01/01/2016");
		String s ="Hello   <<name>>,   We   have   your   full name   as   <<fullname>>   in   our   system.   your   contact   number   is   91­xxxxxxxxxx. Please,let   us   know   in   case   of   any   clarification   Thank   you   BridgeLabz 01/01/2016";	
		match obj3 = new match();
		String s4=obj3.date(s);
		System.out.println(s4);

		}
	}

		class match{
		public static String date(String s) {
			String i;
			i=s;
			
    			//String expression ="01/01/2016"; 
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



