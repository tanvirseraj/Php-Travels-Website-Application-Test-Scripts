package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyManager {
	static FileInputStream file;
	Properties prop;
	// Constructor
	public PropertyManager() throws IOException
	{
		// Instantiating the Properties Class
		prop = new Properties();
		
		// Reading the config.properties file
		try {
			file = new FileInputStream("src\\test\\java\\configs\\config.properties");
		} catch(FileNotFoundException e) {
			System.out.println(e);
		} catch(IOException e) {
			System.out.println(e);
		}
		
		// Loading the file stream into the prop object
		prop.load(file);
	}
	
	// Getting the value of a config key
	public String getKeyValue(String keyName)
	{
		// Returning the property value for te specified key
		return prop.getProperty(keyName);
	}
}
