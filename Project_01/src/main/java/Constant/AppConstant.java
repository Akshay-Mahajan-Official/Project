package Constant;

public class AppConstant {

	private AppConstant()
	{
		throw new IllegalStateException("AppConstant class");
	}
	
	private static final String User_Directory = System.getProperty("user.dir");
	private static final String ChromePath = System.getProperty("user.dir") + "\\driver\\chromedriver.exe";
	private static final String PropertiesFilePath = System.getProperty("user.dir") + "\\application.properties";
	private static final String ExcelTestDataPath = System.getProperty("user.dir") + "\\Test-Data\\Test_Data.xlsx";
	
	public static String getPropfilepath()
	{
		return PropertiesFilePath;
	}
	
	public static String getUserdirectory()
	{
		return User_Directory;
	}
	
	public static String getChromepath()
	{
		return ChromePath;
	}
	
	public static String getExceldata()
	{
		return ExcelTestDataPath;
	}
}
