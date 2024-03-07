import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataRead {
	
	public void readDatFile() throws IOException
	{
		File f = new File("..//WebAutomation/test.txt");
		FileReader fr = new FileReader(f);
		int a;
		while((a=fr.read()) !=-1) //read file chars till -1
		{
			//convert int to char
			System.out.println((char)a);  
		}
	}
	public void readLineByLine() throws IOException
	{
		File f = new File("..//WebAutomation/test.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s;
		while((s=br.readLine())!=null) // read line untill null
		{
			System.out.println(s); 
		}
		
	}
	
	public void writeData() throws IOException
	{
		File f = new File("..//WebAutomation/test.txt");
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter b = new BufferedWriter(fw);
		b.write("Testing ");
		b.newLine();
		b.write("Web Testing ");
		b.newLine();
		b.write("Appended line ");
		b.close();
		
	}
	public static void main(String[] args) throws IOException {
		 
		DataRead a = new DataRead();
		a.writeData();
		
				
		//read.readDatFile();
		//read.readLineByLine();
		
		
	}

}
