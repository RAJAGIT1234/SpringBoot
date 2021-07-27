package in.nareshit.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import in.nareshit.raghu.model.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Integer> {

}
