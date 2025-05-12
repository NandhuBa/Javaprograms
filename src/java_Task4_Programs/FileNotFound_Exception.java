package java_Task4_Programs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFound_Exception {

	public static void main(String[] args) 
	
	{
		
		try
		{
			FileReader File = new FileReader("D:\\GUVI\\Java program\\exp\\prog.txt");
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("Error Message : File is not found in the specified path");
		}
	}

}
