package camt.cbsd.security.repository;

import camt.cbsd.entity.security.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by CAMT on 21/4/2560.
 */
public interface AuthorityRepository extends JpaRepository<Authority, Long> {
}
