package in.nareshit.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.raghu.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
