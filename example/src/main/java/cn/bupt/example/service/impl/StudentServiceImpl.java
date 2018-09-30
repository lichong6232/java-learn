package cn.bupt.example.service.impl;

import cn.bupt.example.mapper.StudentMapper;
import cn.bupt.example.model.Student;
import cn.bupt.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lichong04
 * @Date: Created in 下午4:24 2018/9/30
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.queryStudentById(id);
    }

    @Override
    public List<Student> list() {
        return studentMapper.queryStudent();
    }

    @Override
    public boolean addStudent(Student student) {
        return studentMapper.addStudent(student)>0;
    }

    @Override
    public boolean removeStudent(Integer id) {
        return studentMapper.deleteStudentById(id)>0;
    }

    @Override
    public boolean updateStudent(Student student) {
        return studentMapper.upadteStudent(student)>0;
    }
}
