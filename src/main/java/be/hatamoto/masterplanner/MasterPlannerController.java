package be.hatamoto.masterplanner;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
    This file defines all API endpoints
 */
@RestController
public class MasterPlannerController {
    @GetMapping("/add")
    public ResponseEntity<Schedule> add(@RequestParam int num1, @RequestParam int num2) {
        Schedule schedule = Solver.add(num1, num2);
        return ResponseEntity.ok(schedule);
    }
}
