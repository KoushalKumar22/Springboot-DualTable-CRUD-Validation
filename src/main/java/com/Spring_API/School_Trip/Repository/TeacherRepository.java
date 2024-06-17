package com.Spring_API.School_Trip.Repository;

import com.Spring_API.School_Trip.Entity.Teachers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teachers,String> {
}
