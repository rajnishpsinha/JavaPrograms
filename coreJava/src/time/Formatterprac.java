package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class Formatterprac {
public static void main (String[]args)
{
LocalDate 	localDate=  LocalDate.now();
DateTimeFormatter formatter= DateTimeFormatter.ofPattern("EEEE dd-MM-yy");
String text= localDate.format(formatter);
LocalDate date = LocalDate.parse(text, formatter);
DateTimeFormatter formatter1 = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

System.out.println("text representation of localdate "+text);
System.out.println("localdate instance of localdate"+date);
System.out.println()

}
}
