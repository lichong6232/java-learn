package cn.bupt.example.controller;

import cn.bupt.example.model.Student;
import cn.bupt.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: lichong04
 * @Date: Created in 下午4:56 2018/9/30
 */

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @GetMapping("/{id}")
    public Object getUser(@PathVariable("id") Integer id){
        return studentService.queryStudentById(id);
    }

    @GetMapping("/list")
    public Object list(){
        return studentService.list();
    }

    @PutMapping("/update")
    public Object update(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @PostMapping("/save")
    public Object save(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @DeleteMapping("/{id}")
    public Object remove(@PathVariable("id") Integer id){
        return studentService.removeStudent(id);
    }

}
