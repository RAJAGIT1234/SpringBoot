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
@Table(name="depttab")
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
    @Id
	@Column(name="dept_Id")
	private Integer deptId;
	@Column(name="dept_Code")
	private String deptCode;
	@Column(name="dept_Admin")
	private String deptAdmin;
	
	
	
}
