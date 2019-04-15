package com.bridgelabz.AddressBookApplication;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

public class FileSystem1 {
	
	public static List<PersonInfo> personList=null;
	
	public static ObjectMapper objectMapper=new ObjectMapper();
	
	//-------------------------------------------------------------//
	
	//generate getters and setters for variable personList of type List<PersonInfo>
	public static List<PersonInfo> getList() {
		return personList;
	}
	public static void setList(List<PersonInfo> personList) {
		FileSystem1.personList = personList;
	}
	
	//--------------------------------------------------------------------//
	//method to create new File
	public static File toCreateNewFile(String fileName,String fileExtension) {
		File file=IntefaceAddress.toGetPathOfFile(fileName, fileExtension);
		try {
			FileWriter fileWriter=new FileWriter(file);
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return file;
	}
}
