import java.io.BufferedReader;
import java.io.FileNotFoundException;

import java.io.IOException;
public class FileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

	java.io.FileReader file = new java.io.FileReader("index.txt");
	
	BufferedReader reader=new BufferedReader(file);
	
		
	String currentline;
	
	while((currentline= reader.readLine())!= null) {
		
		System.out.println(currentline);

	}

}
}
