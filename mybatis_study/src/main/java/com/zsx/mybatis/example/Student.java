package com.zsx.mybatis.example;

import lombok.Data;

/**
 * @author zhangshuxiong
 * @date 2020/11/17 12:37 上午
 */
@Data
public class Student {

  private Integer id;
  private String name;
  private Integer age;

  public Student(Integer id, String name, Integer age) {

    this.id = id;
    this.age = age;
    this.name = name;

  }

}
