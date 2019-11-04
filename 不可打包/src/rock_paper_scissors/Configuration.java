package rock_paper_scissors;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Configuration {
	static String PATH=null;
	public static String getPath() {
		File file=new File("src\\rock_paper_scissors\\Configuration.txt");   
		
		if(!file.exists())    
		{    
		      
		        try {
					file.createNewFile();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}    
		  
		}
		try {
			BufferedReader in =new BufferedReader(new FileReader(file));
			
		  
//		   while ((line = in.readLine()) != null) {
//		       
//		       System.out.println(line);
//		   }
		   PATH =in.readLine();
		   in.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		//System.out.println(PATH);
		return PATH;

		
	}
	
	public static void setPATH(String pATH) {
		File file=new File("src\\rock_paper_scissors\\Configuration.txt"); 
		File file1=new File("src\\rock_paper_scissors\\Configuration1.txt"); 
		if(file.exists())    
		{    
		      
		        file.delete();    
		  
		}
		if(!file1.exists())    
		{    
		      
		        try {
					file1.createNewFile();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}    
		  
		}
		try {
			BufferedWriter out=new BufferedWriter(new FileWriter(file1));
			out.write(pATH);
			out.flush(); 
			out.close();
			file1.renameTo(file);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		PATH = pATH;
	}
	
	
}
