package test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.FileWriter;
import java.io.Writer;

import app.*;

public class Test0 {
	
	public static void main(String[] args) {
		System.out.println("Test 0 started.");
		
		Alphabet ab = new Alphabet("abcdefghijklmnopqrstuvwxyz ");
		
		try {
			
			Reader rd = new FileReader("./test data/yomama");
			Writer wr = new FileWriter("./test data/yomama-2");
			
			Preprocessor.processTxt(rd, wr, ab);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Test 0 completed.");
	}

}
