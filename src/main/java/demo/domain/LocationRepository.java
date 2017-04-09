package demo.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by vagrant on 4/7/17.
 */
public interface LocationRepository extends JpaRepository<Location, Long> {
    Page<Location> findByRunnerMovementType(Location.RunnerMovementType runnerMovementType, Pageable pageable);
}
