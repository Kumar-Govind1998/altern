package genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile implements Autoconstant{

	public String getData(String Key) throws FileNotFoundException, IOException
	{
		Properties p =new Properties();
		p.load(new FileInputStream(propertyFilePath));
		return p.getProperty(Key);
	}
}
