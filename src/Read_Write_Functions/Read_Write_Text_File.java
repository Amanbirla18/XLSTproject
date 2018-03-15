package Read_Write_Functions;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_Write_Text_File {
	public static void main(String[] args) throws IOException {
		
		// creating the file
		File f = new File("C:\\Users\\IBM_ADMIN\\Downloads\\Desktop\\Testing\\test.txt");
		f.createNewFile();
		
		//write to the file
		
		FileWriter w = new FileWriter("C:\\Users\\IBM_ADMIN\\Downloads\\Desktop\\Testing\\test.txt");
		BufferedWriter out = new BufferedWriter(w);
		out.write("Hello I am writing the first line in the file");
		out.newLine();
		out.write("Hello I am writing the second line in the file");
		out.newLine();
		out.write("Hello I am writing the third line in the file");
		out.newLine();
		out.write("Hello I am writing the fourth line in the file");
		out.newLine();
		out.write("Hello I am writing the fifth line in the file");
		out.newLine();
		out.write("Hello I am writing the sixth line in the file");
		out.newLine();
		out.flush();
		out.close();
		
		FileReader rd = new FileReader("C:\\Users\\IBM_ADMIN\\Downloads\\Desktop\\Testing\\test.txt");
		BufferedReader in = new BufferedReader(rd);
		
		/*	
		System.out.println(in.readLine());
		System.out.println(in.readLine());
		System.out.println(in.readLine());
		System.out.println(in.readLine());
		System.out.println(in.readLine());
		System.out.println(in.readLine());
		System.out.println(in.readLine());
		*/
		String line;
		int count = 0;
		while((line= in.readLine()) != null ){
		System.out.println(line);
		System.out.println(count);
		System.out.println("Lenght " + line.length());
		
		
		count = count +1;
		}
		System.out.println(count);
		/*	
		String line = null;
		while((line = in.readLine()) != null) {
			for(int i = 0; i <=line.length(); i++);
			System.out.println(line);
			*/
		}
			
		}
		
	


