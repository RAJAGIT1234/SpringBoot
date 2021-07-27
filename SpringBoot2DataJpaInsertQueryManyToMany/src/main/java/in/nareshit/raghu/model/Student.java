package in.nareshit.raghu.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="stdtab")
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	@Id
	@Column(name="SID")
	private Integer sid;
	@Column(name="SNAME")
	private String sname;
	@Column(name="SMAIL")
	private String smail;
	
	@ManyToMany
	@JoinTable(name="stdcrstab",
	joinColumns=@JoinColumn(name="sidFk"),
	inverseJoinColumns=@JoinColumn(name="cidFk"))
	private Set<Course>cob;
}
