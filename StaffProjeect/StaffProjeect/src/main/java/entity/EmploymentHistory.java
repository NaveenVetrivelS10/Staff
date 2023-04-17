package entity;
@Entity
public class EmploymentHistory 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer jId;
	private String jobTitle;
	private String companyName;
	private Integer years;
	
