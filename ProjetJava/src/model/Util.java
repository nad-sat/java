package model;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class Util {
	
	public static String ticksToTime(long millis) {
		TimeZone tz = TimeZone.getTimeZone("Europe/Berlin");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		df.setTimeZone(tz);
		String time = df.format(new Date(millis));
		return time;
		}
	/**
	 *
	 * @param message, type
	 *  Une méthode print qui permet d'afficher les informations 
	 *
	 */
 public static void print( String message,int type) {
	 if(type == 0){
		 String time = Util.ticksToTime(System.currentTimeMillis());
         System.out.println("[ "+time+" - INFO] "+message);
	  }
	 else if(type == 1) {
		 String time = Util.ticksToTime(System.currentTimeMillis());
         System.out.println("[ "+time+" - ALERTE] "+message);
	  }
	 else if(type == 2) { 
		 String time = Util.ticksToTime(System.currentTimeMillis());
         System.out.println("[ "+time+" - ERREUR] "+message);
 }
 }
}
