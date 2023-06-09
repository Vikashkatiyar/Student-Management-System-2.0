package net.javaguides.sms.service;


import java.util.List;

import net.javaguides.sms.entity.Student;


public interface IStudentService {
   List<Student> getAllStudents();
   Student saveStudent(Student student);
   
   Student getStudentById(Long id);
   Student updateStudent(Student student);
   
   void deleteStudentById(Long id);
   
}
