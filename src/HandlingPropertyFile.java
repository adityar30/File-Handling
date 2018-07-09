import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//To Read Data from Property File
		/*FileInputStream a=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\HandlingExcelFile\\src\\Prop.properties");
		Properties obj = new Properties();
		obj.load(a);
		System.out.println(obj.getProperty("URL"));
		
		//obj.setProperty("Role", "005");
*/		
		
		// To Write into Property file
		FileOutputStream a=new FileOutputStream("C:\\Users\\Admin\\eclipse-workspace\\HandlingExcelFile\\src\\Prop.properties");
		Properties obj = new Properties();
		obj.setProperty("Role", "005");
		obj.setProperty("Textbox", "006");
		obj.setProperty("Textbox", "006");
		obj.store(a, "Info");
		
		
	}

}
