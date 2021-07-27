package in.nareshit.raghu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
	private String  prodCode;
	@Column(name="PROD_COST")
	private Double prodCost;
	
	
	@Lob
	@Column(name="PIMG")
	private byte[] prodImg;
	@Lob
	@Column(name="PNOTE")
	private char[] prodDesc;
	
	
	
}
