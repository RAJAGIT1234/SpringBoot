package in.nareshit.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.raghu.model.Dept;

public interface DeptRepository extends JpaRepository<Dept,Integer> {

}
