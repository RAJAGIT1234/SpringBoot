package in.nareshit.raghu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="prodtab")
public class Product {
	@Id
	@Column(name="pid")
	@GeneratedValue
	private Integer prodId;
	
	@Column(name="pcode")
	private String prodCode;
	@Column(name="pcost")
	private Double prodCost;
	@Column(name="pven")
	private String prodVen;
	@Column(name="pnote")
	private String prodNote;
	
	@Column(name="pgst")
	private Double prodGst;
	@Column(name="pdisc")
	private Double prodDisc;
}