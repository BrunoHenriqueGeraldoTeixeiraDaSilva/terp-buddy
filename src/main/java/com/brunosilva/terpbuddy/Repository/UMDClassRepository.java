package com.brunosilva.terpbuddy.Repository;

import com.brunosilva.terpbuddy.Entities.UMDCourses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UMDClassRepository extends JpaRepository<UMDCourses, Long> {
    List<UMDCourses> findByName (String name);
    List<UMDCourses> findByCode (String code);
}
