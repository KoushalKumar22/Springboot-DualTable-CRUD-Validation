package com.Spring_API.School_Trip.Repository;

import com.Spring_API.School_Trip.Entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Students,Integer> {
}
