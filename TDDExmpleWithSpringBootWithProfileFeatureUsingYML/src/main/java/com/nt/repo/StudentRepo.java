package com.nt.repo;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.model.Student;
@Repository
@Profile({"dev","prod"})
public interface StudentRepo extends JpaRepository<Student, Integer> {
}
