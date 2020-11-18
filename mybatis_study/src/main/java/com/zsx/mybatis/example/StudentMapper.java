package com.zsx.mybatis.example;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhangshuxiong
 * @date 2020/11/17 12:39 上午
 */
public interface StudentMapper {

  Student findById(Integer id);

  List<Student> findStudentLike(@Param("like") String like);

  void insert(Student student);

}
