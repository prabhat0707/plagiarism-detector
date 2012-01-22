package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Preprocessor {
	
	public static void processTxt(Reader source, Writer target,Alphabet a){
		BufferedReader br = new BufferedReader(source);
		BufferedWriter bw = new BufferedWriter(target);
		
		
		try {
			String line = br.readLine();
			StringBuffer newLine = new StringBuffer(line.length());
			while (line != ""){
				line = line.toLowerCase();
				for (int i=0; i<line.length();i++){
					if (a.verifyInclusion(line.charAt(i))){
						newLine.append(line.charAt(i));
					}
				}
				line = newLine.toString();
				bw.write(line);
				bw.newLine();
				
				line = br.readLine();
				newLine = new StringBuffer(line.length());
			}

			br.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
