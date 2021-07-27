package in.nareshit.raghu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="Emp_tab")
public class Employee {

	@Id
	@Column(name="EMP_ID")
	private Integer empId;
	@Column(name="EMP_NAME")
	private String empName;
	@Column(name="EMP_SAL")
	private Double empSal;
	
	@ManyToOne
	@JoinColumn(name="didFK")
	private Dept dob;
	
}
