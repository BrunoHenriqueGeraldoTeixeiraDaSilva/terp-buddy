package com.brunosilva.terpbuddy.Repository;

import com.brunosilva.terpbuddy.Entities.UserCourses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserCoursesRepository extends JpaRepository<UserCoursesRepository, Long> {
    List<UserCourses> findByUserId(Long userId);
    List<UserCourses> findByClassId(Long classId);
}
