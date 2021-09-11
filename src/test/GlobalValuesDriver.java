package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDriver {
	
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\JavaWorkspace\\TestNGTutorial\\src\\test\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		//to write in property file
		FileOutputStream fos = new FileOutputStream("D:\\JavaWorkspace\\TestNGTutorial\\src\\test\\data.properties");
		prop.store(fos, null);
	}
	
}
