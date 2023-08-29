package com.batch.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.batch.model.Teacher;

@Repository
public interface TeacherReository extends JpaRepository<Teacher, Integer> {


}
