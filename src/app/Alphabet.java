package app;

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
	
	public boolean verifyInclusion(char x){
		for (int i=0; i<lenght;i++){
			if (chars[i]==x) return true;
		}
		return false;
	}
}
