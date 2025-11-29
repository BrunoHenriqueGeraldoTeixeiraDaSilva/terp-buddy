package com.brunosilva.terpbuddy.Repository;

import com.brunosilva.terpbuddy.Entities.UMDCourses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UMDClassRepository extends JpaRepository<UMDCourses, Long> {

}
