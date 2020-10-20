import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritterSample {
	
	public static void main(String[] args) throws IOException {
		
		//Using File Writer
		
		FileWriter writer= new FileWriter("index.txt");
		writer.write("learn java concepts");
		writer.close();
		
		//Using Buffered Writer
		
		FileWriter buffer= new FileWriter("Usingbuffer.txt");
		BufferedWriter buffered = new BufferedWriter(buffer);
		buffered.write("must learn selenium");
		buffered.close();
	}

}
