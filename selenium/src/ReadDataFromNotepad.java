import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFromNotepad {

	public static void main(String[] args) throws Throwable {
		FileInputStream fobj = new FileInputStream("./CoopData.properties");
		Properties pobj =new Properties();
		pobj.load(fobj);
		String USERLIST0=pobj.getProperty("name1");
		String USERLIST1=pobj.getProperty("name2");
		System.out.println(USERLIST0);
		System.out.println(USERLIST1);
		

	}

}
