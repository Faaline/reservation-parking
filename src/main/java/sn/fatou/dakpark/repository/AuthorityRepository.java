package sn.fatou.dakpark.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.fatou.dakpark.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
