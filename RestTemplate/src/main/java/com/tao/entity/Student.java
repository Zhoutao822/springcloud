package com.tao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author zhoutao
 * @description: TODO
 * @date 2020/2/19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private long id;
    private String name;
    private int age;
}
