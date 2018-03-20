package reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readline {
	public static void main(String[] args) {
		File file=new File("C:/Users/RaviTeja/Desktop/xpath.txt");
		try {
			FileReader filere=new FileReader(file);
			BufferedReader reader=new BufferedReader(filere);
			
			try {
			String line=reader.readLine();
			
			while (line!=null) {
				
				System.out.println(line);
				
				line=reader.readLine();
				
			}
				
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
