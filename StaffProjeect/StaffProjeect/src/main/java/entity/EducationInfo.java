package entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class EducationInfo 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eid;
	private String collage;
	private String degree;
	private String major;
	private String yop;
}
