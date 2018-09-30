package cn.bupt.mybatis.main;

import cn.bupt.mybatis.mapper.StudentMapper;
import cn.bupt.mybatis.model.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author: lichong04
 * @Date: Created in 下午3:14 2018/9/30
 */
public class Main {

    public static void main(String[] args) throws IOException {
        //mybatis的配置文件
        String resource = "config.xml";
        //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
        InputStream is = Main.class.getClassLoader().getResourceAsStream(resource);
        //构建sqlSession的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        //使用MyBatis提供的Resources类加载mybatis的配置文件（它也加载关联的映射文件）
        // Reader reader = Resources.getResourceAsReader(resource);
        // 构建sqlSession的工厂
        // SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        // 创建能执行映射文件中sql的sqlSession
        SqlSession session = sessionFactory.openSession();
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        //通过id查询学生信息
        Student student = studentMapper.queryStudentById(1);
        System.out.println(student);
        //更新学生信息
        student.setAge(30);
        studentMapper.upadteStudent(student);
        List<Student> students = studentMapper.queryStudent();
        System.out.println(students);
        //插入学生信息
        Student student1 = new Student();
        student1.setAge(26);
        student1.setName("lisi");
        studentMapper.addStudent(student1);
        //通过id删除学生信息
        studentMapper.deleteStudentById(2);
        session.commit();
        session.close();
        is.close();

    }
}
