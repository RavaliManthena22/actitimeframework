package Data_utility;

import java.io.FileInputStream;
import java.util.Properties;

public class Keyword_driven_propertiesfile {
	public String getdata(String key) throws Exception {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\login.properties");
		Properties p=new Properties();
		p.load(fis);
		String data= p.getProperty(key);
		return data;
}
}
