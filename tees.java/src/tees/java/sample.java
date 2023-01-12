package tees.java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class sample {
	 public static void main(String[] args){
		 LocalDateTime datetime=LocalDateTime.of(2020, 06,7,1,1,1).plusHours(30);
		 DateTimeFormatter formatterPattern=DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
		 String str=datetime.format(formatterPattern);
				 System.out.println(str);
	 }
	 
	        
}
