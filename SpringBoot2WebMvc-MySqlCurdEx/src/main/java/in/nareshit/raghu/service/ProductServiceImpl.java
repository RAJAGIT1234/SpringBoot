package in.nareshit.raghu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import in.nareshit.raghu.exception.ProductNotFoundException;
import in.nareshit.raghu.model.Product;
import in.nareshit.raghu.repository.ProductRepository;


@Service //calc+ opr/Tx Management
public class ProductServiceImpl implements IProductService {

	@Autowired
	private ProductRepository repo;
	
	public Integer saveProduct(Product p) {
		//calculation
		//JDK 10 # local variable type inference
		// Datatype is selected by java compiler
		double cost = p.getProdCost();
		p.setProdDisc(cost*0.8);
		p.setProdGst(cost*0.12);
		
		p = repo.save(p);
		return p.getProdId();
	}

	public void updateProduct(Product p) {
		//is exist then update
		double cost = p.getProdCost();
		p.setProdDisc(cost*0.8);
		p.setProdGst(cost*0.12);
		
		repo.save(p);
	}

	public void deleteProduct(Integer id) {
		//repo.deleteById(id);
		repo.delete(getOneProduct(id));
	}

	public Product getOneProduct(Integer id) {
		/*Optional<Product> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		} else {
			throw new ProductNotFoundException(
					"No Product Exist with id "+id);
		}*/
		return repo.findById(id).orElseThrow(
				()->new ProductNotFoundException(
				"No Product Exist with id "+id));
		
	}

	public List<Product> getAllProducts() {
		List<Product> list = repo.findAll();
		return list;
	}
	
	public Page<Product> getAllProducts(Pageable pageable) {
		return repo.findAll(pageable);
	}

}