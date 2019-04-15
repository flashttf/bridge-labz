package com.bridgelabz.AddressBookApplication;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public interface IntefaceAddress {
/*Purpose:To hold address path to save/read file from destination
 * 
 */
	
	ObjectMapper objectMapper=new ObjectMapper();
	
	//method to get path of file
	public static File toGetPathOfFile(String fileName,String fileExtension) {
		fileName="/home/admin1/Desktop/pawan"+fileName+fileExtension;
		
		File file=new File(fileName);
		return file;
	}
	
	
	public static void toSaveFile(File file) {
		List<PersonInfo> savedList=FileSystem1.getList();
		
		try {
			objectMapper.writerWithDefaultPrettyPrinter().writeValue(file, savedList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void toReadFile(File file) {
		try {
			FileSystem1.setList(objectMapper.readValue(file, new TypeReference<List<PersonInfo>>() {
			}));
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
