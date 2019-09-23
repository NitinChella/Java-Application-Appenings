package input;
import javax.swing.*;
import java.io.*;


public class Event implements Serializable {

public static final long serialVersionUID = 1L;

public String name;
 
 public String block;
 public String room;
 
 public int [] date=new int[3];
 public int [] timeS=new int[2];
 public int [] timeE=new int[2];
 public String dateString;
 public String timeStringS;
 public String timeStringE;
 
 
 public String nameOfOrganizer;
 public String phoneNumber;
 
 public String referenceLink;
 
 void setname(){
	 name=JOptionPane.showInputDialog("Enter the Event NAME:");
 }
 
 void setLocation(){
	 block=JOptionPane.showInputDialog("Enter the Event BLOCK:(ABx)");
	 room=JOptionPane.showInputDialog("Enter the Event ROOM:");
 }
 
 void setDateTime(){
	 dateString=JOptionPane.showInputDialog("Enter the Event DATE:(DD/MM/YY)");
	 date[0]=Integer.parseInt(dateString.substring(0,1));
	 date[1]=Integer.parseInt(dateString.substring(3,4));
	 date[2]=Integer.parseInt(dateString.substring(6,7));
	 timeStringS=JOptionPane.showInputDialog("Enter the Event START TIME:(HH:MM)");//24 hour format
     timeS[0]=Integer.parseInt(timeStringS.substring(0,1));
     timeS[1]=Integer.parseInt(timeStringS.substring(3,4));
     timeStringE=JOptionPane.showInputDialog("Enter the Event END TIME:(HH:MM)");//24 hour format
     timeE[0]=Integer.parseInt(timeStringE.substring(0,1));
     timeE[1]=Integer.parseInt(timeStringE.substring(3,4));

 }
 void setDetailsOfOrganizer(){
	 nameOfOrganizer=JOptionPane.showInputDialog("Enter the Event ORGANIZER_NAME:");
	 phoneNumber=JOptionPane.showInputDialog("Enter the Event ORGANIZER_PHNUMBER :");
 }
 
 void setReferenceLink(){
	 referenceLink=JOptionPane.showInputDialog("Enter any REFERENCELINKS:");
 }
 String getName(){
	 return this.name;
}
 String getLocation(){
	 return block+" "+room;
 }
 String getDateTime(){
	 return dateString+" @ "+timeStringS+"-"+timeStringE;
 }
 
 String getDetailsOfOrganizer(){
	 
	 return nameOfOrganizer+" "+phoneNumber;
 }
 
 String getreferenceLink(){
	 return referenceLink;
 }
}
