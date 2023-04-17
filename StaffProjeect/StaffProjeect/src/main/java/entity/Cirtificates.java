package entity;
@Entity
public class Cirtificates 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cId
	private String institeuename;
	private Integer years;
}
