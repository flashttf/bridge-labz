package com.bridgelabz.DesignPatterns.prototype;

import java.util.ArrayList;
import java.util.List;

/* Prototype pattern is used when the object creation is costly affair and requires
 * a lot of time and resources and you have a  similar object already existing.
 * 
 *->prototype pattern provides a mechanism to copy the original  object to a new
 * object and then modify it according to our needs.Prototype design pattern uses
 * java Cloning to copy the object.
 * 
 * ex.Suppose we have to an object that loads data from database.
 *    Now we need to modify this data in our program multiple times,so its not
 *    a good idea to create a Object using the new keyword and load all the data
 *    again from the database.
 *    Better approach  would be to clone the existing object into  a new object
 *    and then do the  data manipulation.
 *  ->Prototype design pattern mandates that the object which you  are copying
 *    should provide the copying feature.It should no be done by any other class.
 *    However whether to use shallow or deep copy of the Object properties depends 
 *    on the requirements and its a design decision.	 	  
 * 
 */
public class Employee implements Cloneable{
		private List<String> empList;
		
		public Employee() {
		 empList=new ArrayList<String>();	
		}
		
		public Employee(List<String> list) {
			this.empList=list;
		}
		
		//adding elements in the list
		public void readData() {
			empList.add("Pawan");
			empList.add("Shreyas");
			empList.add("Kiran");
			empList.add("Lisa");
		}
		
		//Method to return the employee list
		public List<String> getEmpList(){
			return empList;
		}
		
	/*clone() Method is overridden to provide a deep  copy of the employee list. 
	 */
		public Object clone() throws CloneNotSupportedException{
				List<String> temp= new ArrayList<String>();
				for(String s:this.getEmpList()) {
					//copying the data of empList to the templist.
					temp.add(s);
				}
				//Object creation with new data
				return new Employee(temp);
		}
}
