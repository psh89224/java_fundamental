import java.io.*;

public class FileViewer {
	public static void main(String[] args)  throws IOException {
		FileReader fis = new  FileReader("C:\\tmp\\hello.txt");
		int data = 0;
		
		while((data=fis.read()) != -1) {
			char c = (char)data;
			System.out.print(c);
		}
	}

}
