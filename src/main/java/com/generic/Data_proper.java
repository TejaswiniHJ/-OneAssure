package com.generic;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Data_proper {
	public String read(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream(AutoConstants.proppath);


		Properties prop=new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);

		return value;
	}
}


