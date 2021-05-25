package in.nareshit.raghu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="emptab")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	@Column(name="eid")
	private Integer empId;
	@Column(name="ename")
    private String empName;
	@Column(name="esal")
	private Double empSal;
}
