package in.nareshit.raghu.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.repo.StudentRepository;

@Component
public class TestFindRunner implements CommandLineRunner {

	
	@Autowired
	private StudentRepository srepo;
	@Override
	public void run(String... args) throws Exception {
		
		//srepo.findBystdCourse("Adv Java")
		//srepo.findBystdFee(300.0)
		//srepo.findBystdIdGreaterThanEqual(15)
		//srepo.findBystdFeeGreaterThan(500.0)
		//srepo.findByStdIdBetween(11, 17)
		//srepo.findByStdNameNotNull()
		//srepo.findByStdNameNotLike("___")
		//srepo.findBystdIdNotOrderByStdName(14)
		//srepo.findBystdIdIn(Arrays.asList(12,14,15,17))
		  //srepo.findBystdIdOrStdName(13,"Jsp")
		//srepo.findBystdIdGreaterThanAndStdNameLike(10,"R%")
		//srepo.findBystdIdGreaterThanAndStdNameNotLike(15,"R%")
		//srepo.findByStdNameContaining("R")
		//srepo.findByStdNameStartingWith("M")
		srepo.findByStdNameEndingWith("N")
		.forEach(System.out::println);
		
	}

}
