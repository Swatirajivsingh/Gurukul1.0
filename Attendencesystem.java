import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Attendencesystem {
	
		void updateAttendence()
		{
			try {
		String fileName = "FeeRecord.txt";
		FileWriter fileWriter;
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
        Date dateObj = new Date();
		String currentDate = dateFormat.format(dateObj);
	    String P ="Present", A = "Absent";
		String S = "Present";
          
		        Scanner in = new Scanner(System.in);
				fileWriter = new FileWriter(fileName,true);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);	
				bufferedWriter.newLine();
				if(S==P)
				{
				bufferedWriter.write(currentDate);
				bufferedWriter.write(",");
				System.out.println("Attendence:");
				S = in.nextLine();
				bufferedWriter.write(S);
				System.out.println("Present");
				}
				else 
				{
				
				bufferedWriter.write(currentDate);
				bufferedWriter.write(",");
				System.out.println("Attendence:");
				A = in.nextLine();
				bufferedWriter.write(A);
				System.out.println("Absent");
				}
				
				
				bufferedWriter.close(); 
			}
			catch(IOException ex) {
            System.out.println("Error writing to file ");
          
                 }
		}

				public static void main(String[] args) {
					Attendencesystem Aps = new  Attendencesystem();
					Aps.updateAttendence();
			}
	}		

            
