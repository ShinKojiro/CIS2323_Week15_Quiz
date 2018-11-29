import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.*;

public class FileStatistics {
	public static void main (String[] args) {
		Path filePath = Paths.get("C:\\Users\\svc_OKC_BT228\\Documents\\Projects\\CIS2323_Week15_Quiz\\someFile.txt");
		int count = filePath.getNameCount();
		System.out.println("File name is: " + filePath.getFileName());
		System.out.println("It is located in: " + filePath.toString());
		
		try{
			BasicFileAttributes attr = Files.readAttributes(filePath, BasicFileAttributes.class);
			System.out.println("It is " + attr.size() + " bytes, and was last modified on " + attr.lastModifiedTime());	
		}
		catch(IOException e){
			System.out.println("A File Error has occurred");
		}
		
	}
}