package com.bridgelabz.oops;

import java.io.IOException;

import javax.swing.text.WrappedPlainView;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtiltiy {
		private static ObjectMapper mapper;
		static {
			mapper=new ObjectMapper();
		}
		
		//----------------------Method to Convert JavaToJson Object----------------------------------///
		
		public static String convertJavaToJson(Object object) {
			String resultJson="";
			try {
				resultJson=mapper.writeValueAsString(object);
			} catch (JsonGenerationException e) {
				System.out.println("Exception occured while converting Java object to JsobOject"+e.getMessage());
				e.printStackTrace();
			} catch (JsonMappingException e) {
				System.out.println("Exception occured while converting Java object to JsobOject"+e.getMessage());
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Exception occured while converting Java object to JsobOject"+e.getMessage());
				e.printStackTrace();
			}
			return resultJson;
		}
		
		//------------------------Method To convert Json to java Object----------------------------------//
		
		public static <T> T convertJsonToJava(String jsonString,Class<T> clas) {
			T result=null;
			
				try {
					result= mapper.readValue(jsonString,clas);
				} catch (JsonParseException e) {
					System.out.println("Exception occured while converting Json to Java Object"+e.getMessage());
					e.printStackTrace();
				} catch (JsonMappingException e) {
					System.out.println("Exception occured while converting Json to Java Object"+e.getMessage());
					e.printStackTrace();
				} catch (IOException e) {
					System.out.println("Exception occured while converting Json to Java Object"+e.getMessage());
					e.printStackTrace();
				}
			return result;
		
		}
		
		
}


