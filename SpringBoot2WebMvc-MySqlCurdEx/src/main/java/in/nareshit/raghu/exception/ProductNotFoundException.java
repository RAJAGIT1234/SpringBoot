package in.nareshit.raghu.exception;

public class ProductNotFoundException
	extends RuntimeException
{

	public ProductNotFoundException() {
		super();
	}
	
	public ProductNotFoundException(String msg) {
		super(msg);
	}
}