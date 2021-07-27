package in.nareshit.raghu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.raghu.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	
	interface MyView{
		//Datatype getVariable
		String getprodCode();
		Double getprodCost();
	}
		//SQL SELECT * FROM PRODUCT WHERE PID<?
	    List<MyView>findByprodIdLessThan(Integer id);
	
	}


