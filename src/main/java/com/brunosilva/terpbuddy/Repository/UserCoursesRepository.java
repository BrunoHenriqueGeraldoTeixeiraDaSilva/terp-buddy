package com.brunosilva.terpbuddy.Repository;

import com.brunosilva.terpbuddy.Entities.UserCourses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserCoursesRepository extends JpaRepository<UserCourses, Long> {
    List<UserCourses> findByUserId(Long userId);       // correct
    List<UserCourses> findByCourseId(Long courseId);   // change from ClassId → CourseId
}