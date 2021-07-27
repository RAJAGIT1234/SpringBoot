package in.nareshit.raghu.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="prodtab")
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	@Id
	@Column(name="PID")
	private Integer pid;
	@Column(name="PCODE")
	private String pcode;
	@Column(name="VENDER")
	private String vender;

	@OneToMany
	@JoinColumn(name="modFk")
	private Set<Model>mob;
}
