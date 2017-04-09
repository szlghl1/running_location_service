package demo.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import demo.service.LocationService;
import demo.domain.Location;

import java.util.List;

/**
 * Created by vagrant on 4/6/17.
 */
@RestController
public class RunningBulkUploadController {
    @Autowired
    private LocationService locationService;

    @RequestMapping(value = "/running", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void upload(@RequestBody List<Location> locations) {
        locationService.saveRunningLocations(locations);
    }

    @RequestMapping(value = "/running/purge", method = RequestMethod.DELETE)
    public void purge() {
        locationService.deleteAll();
    }

    @RequestMapping(value = "/running/{movementType}", method = RequestMethod.GET)
    public Page<Location> findByMovementType(@PathVariable String movementType,
                                             @RequestParam(name = "page") int page,
                                             @RequestParam(name = "size") int size) {
        //return null;
        return locationService.findByRunnerMovementType(movementType, new PageRequest(page, size));
    }
}
