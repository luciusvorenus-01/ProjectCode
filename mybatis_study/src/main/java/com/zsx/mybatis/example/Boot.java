package com.zsx.mybatis.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author zhangshuxiong
 * @date 2020/11/17 12:40 上午
 */
public class Boot {

  public static void main(String[] args) throws IOException {

    //获取SqlSession
    InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession = sqlSessionFactory.openSession();

    //获取mapper映射配置
    StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

    //使用mapper接口中的方法操作数据库
//    studentMapper.insert(new Student(6,"zhanglisi", 20));
//    studentMapper.insert(new Student(7,"zhangwanger", 25));
//    studentMapper.insert(new Student(8,"zhangguanyu", 30));
//    sqlSession.commit();

//    Student student = studentMapper.findById(1);
//    System.out.println(student);

    List<Student> studentList = studentMapper.findStudentLike("zhang%");
    for(Student student:studentList) {

      System.out.println(student);

    }

  }

}
