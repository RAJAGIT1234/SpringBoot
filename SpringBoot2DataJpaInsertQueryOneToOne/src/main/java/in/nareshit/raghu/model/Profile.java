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
@Table(name="pfiletab")
@AllArgsConstructor
@NoArgsConstructor
public class Profile {

	@Id
	@Column(name="PROF_ID")
	private Integer profId;
	@Column(name="PROF_CODE")
	private String profCode;
	@Column(name="PROF_EXP")
	private Double profExp;
	@Column(name="PROF_PACK")
	private Double profPack;
	
}
