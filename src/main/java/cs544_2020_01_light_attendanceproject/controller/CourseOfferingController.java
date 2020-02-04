package cs544_2020_01_light_attendanceproject.controller;

import cs544_2020_01_light_attendanceproject.domain.CourseOffering;
import cs544_2020_01_light_attendanceproject.service.CourseOfferingService;
import cs544_2020_01_light_attendanceproject.service.CourseOfferingService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/courseOffering")
public class CourseOfferingController {
    private CourseOfferingService courseOfferingServise;

    @PostMapping("/course")
    @ResponseStatus(HttpStatus.CREATED)
    public CourseOffering createCourseOffering(@RequestBody @Valid CourseOffering courseOffering) {
        return courseOfferingServise.createOfferingCourse(courseOffering);
    }

    @GetMapping("/course")
    public List<CourseOffering> all() {
        return courseOfferingServise.getAllCourseOffering();
    }

    @GetMapping("/course/{id}")
    public CourseOffering one(@PathVariable Long id) {
        return courseOfferingServise.getCourseOffering(id);
    }

    @DeleteMapping("/course/delete")
    public void deleteCourseOffering(CourseOffering courseOffering) {
        courseOfferingServise.deleteOfferingCourse(courseOffering);
    }

    @PutMapping("/user/update")
    public CourseOffering updateCourseOffering(@RequestBody @Valid CourseOffering courseOffering) {
        return courseOfferingServise.updateCourseOffering(courseOffering);
    }
}