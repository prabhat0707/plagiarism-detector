
public class Alphabet {

	private char chars [];
	private int lenght;
	
	
	public Alphabet(String alphabet) {
		lenght = alphabet.length();
		chars = new char[lenght];
		for (int i=0; i<lenght;i++){
			chars[i] = alphabet.charAt(i);
		}
	}
}
