package Explicitwait;

import java.time.LocalDate;

public class Calenderpopup {

	public static void main(String[] args) {
		//month value
		int currentmonth = LocalDate.now().getMonthValue();
          System.out.println(currentmonth);
          
          //month name
          String currentmonthname = LocalDate.now().getMonth().name();
          System.out.println(currentmonthname);
          
          //lower case the month name
          String lmonthname = currentmonthname.toLowerCase();
          System.out.println(lmonthname);
		
          //first letter capital else small
          String actualmonthname = lmonthname.substring(0, 1).toUpperCase()+lmonthname.substring(1);
          System.out.println(actualmonthname);
          
          //current date
          int currentdate = LocalDate.now().getDayOfMonth();
          System.out.println(currentdate);
          
          //current year
          int currentyear = LocalDate.now().getYear();
          System.out.println(currentyear);
          
          //select month value after 3 month
         int expmonth = LocalDate.now().plusMonths(3).getMonthValue();
          System.out.println(expmonth);
          
          //select 1 plus date
          int expdate = LocalDate.now().plusDays(1).getDayOfMonth();
          System.out.println(expdate);
          
          //select plus 2 years
          int expyear = LocalDate.now().plusYears(2).getYear();
          System.out.println(expyear);
          
	}

}
