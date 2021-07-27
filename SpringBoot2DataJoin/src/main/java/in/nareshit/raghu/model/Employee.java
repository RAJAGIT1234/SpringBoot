package in.nareshit.raghu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="emptab")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@Id
	@Column(name="EMP_ID")
	private Integer eId;
	@Column(name="EMP_NAME")
	private String  ename;
	@Column(name="ESAL")
	private Double esal;
	
	
	@ManyToOne
	@JoinColumn(name="didFk")
	private Dept dob;
	
}
