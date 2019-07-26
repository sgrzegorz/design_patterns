import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
	public static void main(String[] args) throws IOException{
		int c;
		try {
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("dekorator1/src/test.txt")));
			while((c= in.read()) >=0) {
				System.out.println((char)c);
			}
			in.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
