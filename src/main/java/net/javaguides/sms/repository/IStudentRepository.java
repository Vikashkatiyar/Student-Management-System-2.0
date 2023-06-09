package net.javaguides.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.sms.entity.Student;


public interface IStudentRepository extends JpaRepository<Student, Long> {

}
