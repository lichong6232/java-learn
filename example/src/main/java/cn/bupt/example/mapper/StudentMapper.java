package cn.bupt.example.mapper;

import cn.bupt.example.model.Student;

import java.util.List;

/**
 * @Author: lichong04
 * @Date: Created in 下午4:32 2018/9/30
 */
public interface StudentMapper {

    Student queryStudentById(Integer id);


    List<Student> queryStudent();

    int upadteStudent(Student student);

    int addStudent(Student student);

    int deleteStudentById(Integer id);
}
