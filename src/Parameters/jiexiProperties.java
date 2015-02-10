package Parameters;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class jiexiProperties {
	private Properties pro = new Properties();
	//private String projectpath = System.getProperty("user.dir");
	String value = null;
	
	public jiexiProperties(String propertiespath) {
		this.loadProperties(propertiespath);
		
	}
	//加载properties
	public void loadProperties(String propertiespath) {
		try {
			InputStream in = new FileInputStream(propertiespath);
			InputStreamReader inr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(inr);
			pro.load(br);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	//获取特定的值
	public String getValue(String keyname) {
		value = pro.getProperty(keyname).trim();
		try {
			value = new String(value.getBytes("UTF-8"),"UTF-8");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return value;
	}		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jiexiProperties a = new jiexiProperties(System.getProperty("user.dir"));
		System.out.println(a.getValue("url"));
	}

}
