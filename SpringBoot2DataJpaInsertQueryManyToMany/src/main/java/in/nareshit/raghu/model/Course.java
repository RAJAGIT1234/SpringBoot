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
@Table(name="crstab")
@AllArgsConstructor
@NoArgsConstructor
public class Course {
	@Id
	@Column(name="CID")
	private Integer cid;
	@Column(name="CNAME")
	private String  cname;
	@Column(name="CFEE")
	private Double cfee;
}
