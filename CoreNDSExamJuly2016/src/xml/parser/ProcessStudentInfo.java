package xml.parser;

import org.xml.sax.SAXException;
import xml.parser.Student;
import xml.parser.XmlReader;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.*;

public class ProcessStudentInfo {

		/* * * Here in the main method fill in the code that outlined to read xml data parsed into 2 separate ArrayList, then store into map.
		 * Once map has all data, retrieve those data and out put to console.
		 *
		 * Do any necessary steps that require for below successful output.
		 * .................................................
		 * Student (id= 1) "Marc" "Carp"       Grade= B
		 * Student (id= 2) "Israt" "Khan"      Grade= A
		 * Student (id= 3) "Mohi" "Uddin"      Grade= A
		 * Student (id= 4) "Abrar" "Hossain"   Grade= B
		 * Student (id= 5) "Abida" "Sultana"   Grade= C
		 * .................................................
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and to retrieve data.
		 *
		 */
			public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException ,NullPointerException{

try {
	//Path of XML data to be read.
	String pathSelenium = "C:\\Users\\Zaqc\\CoreNDSExamJuly2016\\src\\xml\\parser\\selenium.xml";
	String pathQtp =  "C:\\Users\\Zaqc\\CoreNDSExamJuly2016\\src\\xml\\parser\\qtp.xml";
	String tag = "id";

	//Declare a Map with List<String> into it.
	HashMap<String, List<Student>> map = new LinkedHashMap<>();
				
				/*Declare 2 ArrayList with Student data type to store Selenium student into one of the ArrayList and
				  Qtp student into another ArrayList. */
	List<Student> seleniumStudents = new ArrayList<Student>();
	List<Student> qtpStudents = new ArrayList<Student>();



	XmlReader reader = new XmlReader();
	seleniumStudents = reader.parseData("Selenium", pathSelenium);
	qtpStudents = reader.parseData("QTP", pathQtp);
	map.put("Selenium", seleniumStudents);
	map.put("QTP", qtpStudents);

	for (Map.Entry<String, List<Student>> entry : map.entrySet()) {
		System.out.println(entry.getKey() + " " + entry.getValue());
	}
}catch (ParserConfigurationException e){
	e.printStackTrace();

}catch (IOException e) {
	e.printStackTrace();

}
				}

}
