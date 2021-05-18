package in.nareshit.Raghu.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	private Integer StdId;
	private String StdName;
	private Double StdFee;
}
