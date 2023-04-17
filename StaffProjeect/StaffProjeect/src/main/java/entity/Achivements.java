package entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Achivements 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Interger aId;
	private String awards;
}
