public class Key {
	private char dLetter; // Decrypted letter
	private String eLetters;
	private int[] eCodes; // Array of integers for encrypted letters 
	
	public Key() { // Default constructor 
		dLetter = ' ';
		eLetters = "";
		eCodes = new int[4];
	}
	
	public Key(char x, int a, int b, int c, int d) { // Overloaded constructor
		dLetter = x;
		eCodes[0] = a;
		eCodes[1] = b;
		eCodes[2] = c;
		eCodes[3] = d;
	}
	
	public Key(char x, String y) {
		dLetter = x;
		eLetters = y;
	}

	// The following methods aren't really used, just there for show
	public void setDLetter(char x) {
		dLetter = x;
	}
	
	public char getDLetter() {
		return dLetter;
	}
	
	public void setECodes(int a, int b, int c, int d) {
		eCodes[0] = a;
		eCodes[1] = b;
		eCodes[2] = c;
		eCodes[3] = d;
	}
	
	public int[] getECodes() {
		return eCodes;
	}

	public String getELetters() {
		return eLetters;
	}
}
