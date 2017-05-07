import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileDecrypter {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		BufferedReader reader = null;
		String line;
		int i;

		
		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\Kidus Yohanes\\workspace\\Substitution Cipher\\src\\data.txt"));
		} catch (FileNotFoundException fnfex) {
			System.out.println(fnfex.getMessage() + "The file was not found");
			//System.exit(0);
		}
		// This reads the lines
		try {
			while ((line = reader.readLine()) != null) {
				//System.out.println(line);
				for (i = 0; i < line.length(); i++) {
					System.out.print(line.charAt(i));
				}
			}
		} catch (IOException ioex) {
			System.out.println(ioex.getMessage() + "Error reading file");
		}
	    /*finally {
			System.exit(0);
	    }*/
		
		
		scnr.close();
		return;
	}

}

/*
abc
def
ghi

*/