package com.brunosilva.terpbuddy.Service;

import com.brunosilva.terpbuddy.Entities.UMDCourses;
import com.brunosilva.terpbuddy.Entities.User;
import com.brunosilva.terpbuddy.Entities.UserCourses;
import com.brunosilva.terpbuddy.Repository.UserCoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserCoursesService {

    private final UserCoursesRepository userCoursesRepository;

    @Autowired
    public UserCoursesService(UserCoursesRepository userCoursesRepository) {
        this.userCoursesRepository = userCoursesRepository;
    }

    // Add a course for a user
    public UserCourses addCourseForUser(User user, UMDCourses course) {
        UserCourses userCourses = new UserCourses(user, course);
        return userCoursesRepository.save(userCourses);
    }

    // Remove a user course by its ID
    public void removeCourseForUser(Long userCourseId) {
        userCoursesRepository.deleteById(userCourseId);
    }

    // Get all courses for a specific user
    public List<UserCourses> getCoursesForUser(Long userId) {
        return userCoursesRepository.findByUserId(userId);
    }

    // Get all users for a specific course
    public List<UserCourses> getUsersForCourse(Long courseId) {
        return userCoursesRepository.findByCourseId(courseId);
    }

    // Fetch a specific UserCourses entry by ID
    public Optional<UserCourses> getUserCourseById(Long id) {
        return userCoursesRepository.findById(id);
    }
}