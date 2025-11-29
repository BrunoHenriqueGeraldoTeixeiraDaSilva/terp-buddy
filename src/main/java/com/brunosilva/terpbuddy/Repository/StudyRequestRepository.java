package com.brunosilva.terpbuddy.Repository;

import com.brunosilva.terpbuddy.Entities.StudyRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudyRequestRepository extends JpaRepository<StudyRequest, Long> {

    List<StudyRequest> findByUserId(Long userId); // requests made by this user
    List<StudyRequest> findByCourseId(Long courseId); // requests for a coursesId);
}

