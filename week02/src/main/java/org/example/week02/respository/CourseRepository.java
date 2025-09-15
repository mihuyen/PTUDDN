package org.example.week02.respository;

import com.example.testing_001.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}