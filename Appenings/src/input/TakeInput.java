package input;
import java.io.*;
import javax.swing.JOptionPane;
import java.util.*;

public class TakeInput {
 public static void main(String [] args) throws IOException{
 File EventFile=new File("Events.txt");
 FileWriter fw;
 File Obj=new File("Obj.txt");
 FileOutputStream fos;
 ObjectOutputStream oos;
 FileInputStream fis;
 ObjectInputStream ois;
 ArrayList<Event>  e=new ArrayList<Event>(); 
 
 JOptionPane.showMessageDialog(null, "Welcome to Appenings! This is an interactive Event Management Application.");	 
 String c=JOptionPane.showInputDialog("Enter (Y) to continue and (N) to exit.");
 String d=JOptionPane.showInputDialog("Would you like to delete the old files(Y/N)");
 if(d.equals("Y")){
  fw=new FileWriter(EventFile);
  fos=new FileOutputStream(Obj);
  oos=new ObjectOutputStream(fos);
  fis=new FileInputStream(Obj);
  ois=new ObjectInputStream(fis);
  e=new ArrayList<Event>();
 }
 else{
  fw=new FileWriter(EventFile,true);
  fos=new FileOutputStream(Obj,true);
  oos=new ObjectOutputStream(fos);
  fis=new FileInputStream(Obj);
  ois=new ObjectInputStream(fis);
  try{
	  e=new ArrayList<Event>();
	  Event old;
	  while((old=(Event)ois.readObject())!=null){
		 e.add(old);
  }
	  }catch(Exception exc){
	  System.out.println("Object retrieval error:"+exc);
  }
 }
 
 while(c.equals("Y")){
	 Event temp=new Event();
	 
	 temp.setname();
	 temp.setDateTime();
	 //validate
     
	 temp.setLocation();
	 for(Event l: e){
		 if(l.getDateTime().equals(temp.getDateTime()))
		 {
			 if(l.getLocation().equals(temp.getLocation()))
				 JOptionPane.showInputDialog(null,"Venue already booked.");
			     continue;
		 }
	 }
	 temp.setDetailsOfOrganizer();
	 temp.setReferenceLink();
	
	 e.add(temp);
	 
	 fw.write("Name:"+temp.getName()+"\n");
	 fw.write("Details of Organizer:"+temp.getDetailsOfOrganizer()+"\n");
	 fw.write("Location:"+temp.getLocation()+"\n");
	 fw.write("Date and time:"+temp.getDateTime()+"\n");
	 fw.write("ReferenceLink:"+temp.getreferenceLink()+"\n");
	 fw.write("\n");
	 oos.writeObject(temp);
	 c=JOptionPane.showInputDialog("Enter (Y) to continue and (N) to exit.");
 }
 fw.close();
 fos.close();
 fis.close();
 oos.close();
 ois.close();

 }
}
