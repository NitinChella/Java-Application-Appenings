package input;
import java.io.*;
import javax.swing.*;
import java.util.*;


public class Output {
 public static void main(String [] args) throws IOException{
	 ArrayList<Event> arr;
	 File fobj=new File("Obj.txt");
	 String name=JOptionPane.showInputDialog("Enter the name:");
	 //System.out.println("Works!!");
	// FileOutputStream fos=new FileOutputStream(fobj);
	 /*ObjectOutputStream oos=new ObjectOutputStream(fos);
	 oos.writeObject("");*/
	 FileInputStream fis=new FileInputStream(fobj);
	 ObjectInputStream ois=new ObjectInputStream(fis);
	 //System.out.println("Works!!");
	 try{
		 arr=new ArrayList<Event>();
		  Event old;
		//	 System.out.println("Works!!");
		try{  while((old=(Event)ois.readObject())!=null){
				 System.out.println("Works!!");

			 arr.add(old);
	      }}catch(Exception )
		  System.out.println("Works!!");
		  for(Event l:arr){
				if(l.name.equals(name))
				{
					System.out.println("Works!!");
					/*JFrame j=new JFrame();
					j.add(new JLabel(new ImageIcon("Amrita_Image.jpg")));
					*/
				}
	 }}catch(Exception exc){
		 System.out.println(exc);
	 }
		
		fis.close();
		ois.close();
	
		
	}
 }

