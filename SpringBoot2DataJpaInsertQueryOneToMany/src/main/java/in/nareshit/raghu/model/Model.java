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
@Table(name="modeltab")
@AllArgsConstructor
@NoArgsConstructor
public class Model {

	@Id
	@Column(name="MID")
	private Integer mid;
	@Column(name="MCODE")
    private String mcode;
	@Column(name="MCOLOR")
    private String mcolor;
	@Column(name="MCOST")
    private Double mcost;
}
