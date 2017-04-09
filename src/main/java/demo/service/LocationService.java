package demo.service;
import java.util.List;
import demo.domain.Location;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
/**
 * Created by vagrant on 4/6/17.
 */
public interface LocationService {
    List<Location> saveRunningLocations(List<Location> runningLocations);

    void deleteAll();

    Page<Location> findByRunnerMovementType(String movementType, Pageable pageable);
}
