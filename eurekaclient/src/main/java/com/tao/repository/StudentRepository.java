package com.tao.repository;

import com.tao.entity.Student;

import java.util.Collection;

/**
 * @author zhoutao
 * @description: TODO
 * @date 2020/2/19
 */
public interface StudentRepository {

    public Collection<Student> findAll();

    public Student findById(long id);

    public void saveOrUpdate(Student student);

    public void deleteById(long id);
}
