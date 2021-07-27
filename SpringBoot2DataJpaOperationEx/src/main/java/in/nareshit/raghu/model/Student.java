package in.nareshit.raghu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name="stdtab")
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	@Id
	@Column(name="sid")
	@NonNull
 private Integer stdId;
	@Column(name="sname")
 private String stdName;
	@Column(name="sfee")
 private Double stdfee;
}
