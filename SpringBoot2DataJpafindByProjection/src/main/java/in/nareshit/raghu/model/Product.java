package in.nareshit.raghu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="protab")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	@Column(name="PROD_ID")
	private Integer prodId;
	@Column(name="PROD_CODE")
	private String  prodCode;
	@Column(name="PROD_COST")
	private Double prodCost;
	
	
	
}
