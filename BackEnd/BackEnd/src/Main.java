import java.util.HashMap;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.awt.List;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");

		String fileName = "ERBB2.fasta";
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = 
					new BufferedReader(fileReader);
			boolean header = true;
			String line;
			String firstLine = bufferedReader.readLine();
			String[] arrayOfSequences = new String[];
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			bufferedReader.close();
		}
		catch(FileNotFoundException ex) {
			System.out.println("Unable to open file " + fileName + "");
		}
		catch(IOException ex) {
			System.out.println(
					"Error reading file '" 
							+ fileName + "'");                  
		}




	}
}
