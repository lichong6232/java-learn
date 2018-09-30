package cn.bupt.mybatis.mapper;

import cn.bupt.mybatis.model.Student;

import java.util.List;

/**
 * @Author: lichong04
 * @Date: Created in 下午2:45 2018/9/30
 */
public interface StudentMapper {

    Student queryStudentById(Integer id);

    List<Student> queryStudent();

    int upadteStudent(Student student);

    void addStudent(Student student);

    int deleteStudentById(Integer id);
}
