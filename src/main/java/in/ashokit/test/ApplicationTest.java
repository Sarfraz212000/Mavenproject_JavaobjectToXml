package in.ashokit.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import in.ashokit.entity.Student;

public class ApplicationTest {

	public static void main(String[] args) throws JAXBException {
		
		Student student= new Student();
		
		student.setSId(101);
		student.setName("Sarfraz");
		student.setDept("BCA");
		student.setCollege("T.P.S");
		student.setPhno(840696);
		
		 
		 JAXBContext instance = JAXBContext.newInstance(Student.class);
	    
	    Marshaller createMarshaller = instance.createMarshaller();
	    
	      File file = new File("src\\main\\resources\\student.xml");
	      
	     createMarshaller.marshal(student, file);
	    
	    

	}

}
