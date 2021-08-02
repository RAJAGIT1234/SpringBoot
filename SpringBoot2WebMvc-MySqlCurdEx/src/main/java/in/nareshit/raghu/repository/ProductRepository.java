package in.nareshit.raghu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.raghu.model.Product;

public interface ProductRepository 
	extends JpaRepository<Product, Integer>
{

}