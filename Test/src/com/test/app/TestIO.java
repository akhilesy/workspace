package com.test.app;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TreeMap;



public class TestIO {
	
	
	
	

	public TestIO(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	//public static void main(String[] args) 
	{
		
/*	
		//LocalDate date=LocalDate.now();
		LocalDate date=LocalDate.of(2021, 02, 05);
	
        String formattedDate = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println(formattedDate);
		
    
		// determine country (Locale) specific first day of current week
		DayOfWeek firstDayOfWeek = WeekFields.of(Locale.getDefault()).getFirstDayOfWeek();
		TemporalField firstDayOfWeek2 = WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear();
		System.out.println("=========="+firstDayOfWeek2);
		
		
		LocalDate lld=LocalDate.of(2021, 02, 05);
		System.out.println(lld);
	
		LocalDate startoftheweek = date.with(TemporalAdjusters.previousOrSame(firstDayOfWeek));
		String date1=startoftheweek.toString();
		System.out.println(date1);
		 System.out.println("first day of week===   "+startoftheweek);
			
		//to find spacific last day of week
		DayOfWeek lastDayOfWeek = firstDayOfWeek.plus(7); // or minus(1)
	    LocalDate endOfWeek = date.with(TemporalAdjusters.nextOrSame(lastDayOfWeek));
		 System.out.println("last day of week===   "+endOfWeek);
		
	 //sending date of the days
		 String s="20150927";
		 DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
		 LocalDate date2 = LocalDate.parse(s, formatter);
		 System.out.println("date string : 20150927, " + "localdate : " + date2);
		 
		 
		 
		 //for local time
		
		// DateTimeFormatter formatter2 = DateTimeFormatter.BASIC_ISO_DATE;
		 LocalDateTime ldt= LocalDateTime.of(2021, 05, 25, 02, 35);
		 String formattedDate2 = ldt.format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm"));
		 System.out.println(formattedDate2);
		 
		 
		 
		 System.out.println("==================================================");
		 System.out.println();
		 ArrayList<IoBean> alt =new ArrayList<IoBean>();
		 IoBean iobean= new IoBean(101,"akhilesh");
		 IoBean iobean2=new IoBean(102,"akhilesh");
		 alt.add(iobean);
		 alt.add(iobean2);
		 System.out.println(alt);
		 */
				 

		 

		
		
	  
		
		 
	
		 
		 
		/*
		 * LocalDate printDate = startOfCurrentWeek; DateTimeFormatter formatter =
		 * DateTimeFormatter.ofPattern("EEE dd/MM/yyyy"); for (int i=0; i < 7; i++) {
		 * System.out.println(printDate.format(formatter)); printDate =
		 * printDate.plusDays(1); }
		 */

		/*
		 * date example
		 * 
		 * 
		 */
		/*
		 * Date thisdate=new Date(); System.out.println(thisdate); DateExample
		 * dateExample=null; SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/Y");
		 * SimpleDateFormat sdf2=new SimpleDateFormat("dd/MM/Y"); String
		 * date=sdf.format("12/05/2021");
		 * 
		 * Date date2=sdf2.parse(date);
		 * 
		 * System.out.println(date); System.out.println(new DateExample(date,date2));
		 */
		
		
		/*
		 * String sDate1="31/12/1998"; Date date1=new
		 * SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
		 * System.out.println(sDate1+"\t"+date1);
		 */
		
		
		/*IO example below 
		 * 
		 * 
		 * 
		 * IoBean iobean =new IoBean(); List iobeanlist=new ArrayList<IoBean>(); int
		 * id=0; String name=null; int input=0; int count =0;
		 * 
		 * Scanner sc=new Scanner(System.in); System.out.println("Enter details"); do {
		 * System.out.println("Enter id"); id=sc.nextInt();
		 * System.out.println("enter name"); name=sc.next();
		 * 
		 * 
		 * 
		 * System.out.println(iobean); iobeanlist.add(new IoBean(id, name));
		 * 
		 * System.out.println(iobeanlist);
		 * 
		 * System.out.println("inter one if next data"); input=sc.nextInt(); count++; }
		 * while(input==1);
		 * 
		 * 
		 * iobean.setId(id); iobean.setName(name);
		 * 
		 * 
		 * iobeanlist.add(iobean);
		 * 
		 * for (Object object : iobeanlist) { System.out.println(iobeanlist);
		 * 
		 * }
		 * 
		 * 
		 * 
		 * PrintWriter out = new PrintWriter("testoutput.txt"); // Step 2
		 * out.println(iobeanlist);
		 * 
		 * out.close();
		 * 
		 */
	}

	
}
