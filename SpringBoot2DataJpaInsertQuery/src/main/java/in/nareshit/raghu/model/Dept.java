package in.nareshit.raghu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="dept_tab")
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
	@Id
	@Column(name="DEPT_ID")
	private Integer deptId;
	@Column(name="DEPT_CODE")
	private String deptCode;
	@Column(name="DEPT_ADMIN")
	private String deptAdmin;

}
