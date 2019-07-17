package A_Interview_String_prorams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLineProg {
	
	public static void main(String[] args) {
		 BufferedReader reader;
		 String Myfile="C:\\Automation\\myfile.txt";
		 try {	
		reader=new BufferedReader(new FileReader(Myfile));
		String line=reader.readLine();
		while(line!=null) {
//			System.out.println(line);
			countWord_UniqueWord.countword(line);
			line=reader.readLine();
		}
		reader.close();
		 } 
			 catch (IOException e){
		//	System.out.println("File Name/Director Name is Invalid");
				 e.printStackTrace();
		 }
		 
	}

}

