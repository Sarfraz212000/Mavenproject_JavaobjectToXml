package in.ashokit.entity;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Student {
	
	private Integer sId;
	private String name;
	private String dept;
	private String college;
	private Integer phno;

}
