package com.tao.feign.impl;

import com.tao.entity.Student;
import com.tao.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author zhoutao
 * @description: TODO
 * @date 2020/2/20
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中";
    }
}
