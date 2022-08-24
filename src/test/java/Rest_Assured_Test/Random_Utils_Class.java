package Rest_Assured_Test;

import org.apache.commons.lang3.RandomStringUtils;

public class Random_Utils_Class {
	
	
	
	public static String getname()
	{
		String GenerateString = RandomStringUtils.randomAlphabetic(5);
		return ("rushi"+GenerateString );
	}
	
	public static  String getjob()
	{
		String GenerateString= RandomStringUtils.randomAlphabetic(5);
		return ("qa"+GenerateString);
	}
	public static  String getid()
	{
		String GenerateString= RandomStringUtils.randomNumeric(5);
		return ("1"+ GenerateString);
	}

}
