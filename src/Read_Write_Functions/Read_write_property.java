package Read_Write_Functions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_write_property {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fs = new FileInputStream("C:\\Users\\IBM_ADMIN\\Downloads\\Desktop\\Testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(fs);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("testSiteName"));
		System.out.println(prop.getProperty("environment"));
		
		prop.setProperty("name", "aman");
		System.out.println(prop.getProperty("name"));
		prop.setProperty("last", "birla");
		System.out.println(prop.getProperty("last"));
		
		FileOutputStream fs1 = new FileOutputStream("C:\\Users\\IBM_ADMIN\\Downloads\\Desktop\\Testing\\prop.properties");
		prop.store(fs1 , "Adding to file");
	}
		

}
