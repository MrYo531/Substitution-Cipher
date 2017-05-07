import java.util.ArrayList;
import java.util.Scanner;

public class Cipher {
	
	private static ArrayList<Key> keyList = new ArrayList<Key>();
	static Key key = new Key();
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		createKeyList();
		
		String lineToDecrypt = "";
		int howManyLines = 1;
		Boolean unknown = false; 
		
		int h = 0; // Controls looping through how many lines
		int i = 0; // Controls looping through each letter
		int j = 0; // Controls looping through each key
		int k = 0; // Controls choosing which encrypted letter
		
		System.out.println("Enter how many lines: ");
		howManyLines = scnr.nextInt();
		scnr.nextLine();
		System.out.println("Enter text to decrypt: ");
		
		for (h = 0; h < howManyLines; h++) {
			lineToDecrypt = scnr.nextLine();
			for (i = 0; i < lineToDecrypt.length(); i++) {
				unknown = true;
				for (j = 0; j < keyList.size(); j++) {
					k = i % 4; // Base 4 encryption
						if (lineToDecrypt.charAt(i) == keyList.get(j).getELetters().charAt(k)) {
							System.out.print(keyList.get(j).getDLetter());
							unknown = false;

					}
				}
				if (unknown) {
					System.out.print("?");
				}
			}
		}
		
		scnr.close();
		return;
	}
	
	static void createKeyList() { // This creates the list of keys used to decode the text
		keyList.add(new Key('a', "CÚN-"));			keyList.add(new Key('A', "cún\n")); // new line character doesn't get recognized
		keyList.add(new Key('b', "@ÙM."));			keyList.add(new Key('B', "`ùm"));
		keyList.add(new Key('c', "AØL/"));			keyList.add(new Key('C', "aøl"));
		keyList.add(new Key('d', "FßK("));			keyList.add(new Key('D', "fÿk"));
		keyList.add(new Key('e', "GÞJ)"));			keyList.add(new Key('E', "gþj	"));
		keyList.add(new Key('f', "DÝI*"));			keyList.add(new Key('F', "dýi\n")); // new line character doesn't get recognized
		keyList.add(new Key('g', "EÜH+"));			keyList.add(new Key('G', "eüh"));
		keyList.add(new Key('h', "JÓG$"));			keyList.add(new Key('H', "jóg"));
		keyList.add(new Key('i', "KÒF%"));			keyList.add(new Key('I', "kòf"));
		keyList.add(new Key('j', "HÑE&"));			keyList.add(new Key('J', "hñe"));
		keyList.add(new Key('k', "IÐD'"));			keyList.add(new Key('K', "iðd"));
		keyList.add(new Key('l', "N×C "));			keyList.add(new Key('L', "n÷c ")); // sometimes gets mixed up with lowercase 'l'
		keyList.add(new Key('m', "OÖB!"));			keyList.add(new Key('M', "oöb"));
		keyList.add(new Key('n', "LÕA\""));			keyList.add(new Key('N', "lõa"));
		keyList.add(new Key('o', "MÔ@#"));			keyList.add(new Key('O', "mô`"));
		keyList.add(new Key('p', "RË_<"));			keyList.add(new Key('P', "rë"));
		keyList.add(new Key('q', "SÊ^="));			keyList.add(new Key('Q', "sê~"));
		keyList.add(new Key('r', "PÉ]>"));			keyList.add(new Key('R', "pé}"));
		keyList.add(new Key('s', "QÈ\\?"));			keyList.add(new Key('S', "qè|"));
		keyList.add(new Key('t', "VÏ[8"));			keyList.add(new Key('T', "vï{"));
		keyList.add(new Key('u', "WÎZ9"));			keyList.add(new Key('U', "wîz"));
		keyList.add(new Key('v', "TÍY:"));			keyList.add(new Key('V', "tíy"));
		keyList.add(new Key('w', "UÌX;"));			keyList.add(new Key('W', "uìx"));
		keyList.add(new Key('x', "ZÃW4"));			keyList.add(new Key('X', "zãw"));
		keyList.add(new Key('y', "[ÂV5"));			keyList.add(new Key('Y', "{âv"));
		keyList.add(new Key('z', "XÁU6"));			keyList.add(new Key('Z', "xáu"));
		
		keyList.add(new Key('0', "‹|"));			keyList.add(new Key(' ', "›l"));
		keyList.add(new Key('1', "Š}")); 			keyList.add(new Key('\n', "(¶%A")); // not sure about this one
		keyList.add(new Key('2', "‰~"));			keyList.add(new Key('[', "yàt"));
		keyList.add(new Key('3', "ˆ"));			keyList.add(new Key(']', "ær"));
		keyList.add(new Key('4', "x"));			keyList.add(new Key(':', "v"));
		keyList.add(new Key('5', "Žy"));			keyList.add(new Key('.', "•b"));
		keyList.add(new Key('6', "z")); 			keyList.add(new Key('-', "–a"));			
		keyList.add(new Key('7', "Œ{"));			keyList.add(new Key('\n', "/±\"F")); // or this one
		keyList.add(new Key('8', "ƒt"));
		keyList.add(new Key('9', "‚u"));
		
	}
	
}

/* Example text to test
  %A(ðJ5QÏ]#IÞKÈ[#PÂ"FwÈJ>õN!GKßZ?â@$CÕJ?/±l#OËZ8GÉCÖJvðfwèvëlA(¶%A(¶%
RËC%AÚ[%MÕl›A#VÞ_-F•J4G¶%KÖJv›JÎCÂ|›uˆv‰~ŠA(•b•b•b•bvvvvvÀT7yàtyàtyàtyàtærærærær

*/
