package jiexi;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class jiexiProperties {
	private Properties pro = new Properties();
	//private String projectpath = System.getProperty("user.dir");
	
	public jiexiProperties(String propertiespath) {
		this.loadProperties(propertiespath);
		
	}
	//加载properties
	public void loadProperties(String propertiespath) {
		try {
			InputStream in = new FileInputStream(propertiespath);
			pro.load(in);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	//获取特定的值
	public String getValue(String keyname) {
		return pro.getProperty(keyname).trim();
	}		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jiexiProperties a = new jiexiProperties("D:/eclipse-standard-kepler-SR2-win32-x86_64/work/JavaBrower/tools/test.properties");
		System.out.println(a.getValue("url"));
	}

}
