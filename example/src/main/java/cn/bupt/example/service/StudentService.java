package cn.bupt.example.service;

import cn.bupt.example.model.Student;

import java.util.List;

/**
 * @Author: lichong04
 * @Date: Created in 下午4:24 2018/9/30
 */
public interface StudentService {

    Student queryStudentById(Integer id);

    List<Student> list();

    boolean addStudent(Student student);

    boolean removeStudent(Integer id);

    boolean updateStudent(Student student);
}
