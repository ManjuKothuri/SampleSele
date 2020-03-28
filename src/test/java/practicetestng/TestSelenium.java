package practicetestng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class TestSelenium {

	public void testconfig() throws Exception {

		File src=new File("./Configuration1/Config.property");

		FileInputStream fis=new FileInputStream(src);

		Properties pro=new Properties();

		pro.load(fis);

		String chromepath=pro.getProperty("chromeDriver");

		System.out.println("Hey chrome path is " + chromepath);
}

	

}
