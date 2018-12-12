package com.smic.springboot.repository;

import com.smic.springboot.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @Description UserRepository接口 继承CrudRepository,不需要自定义接口，即不需要UserRepositoryImpl
 * @Date 2018/12/11
 * @Author Cai Feng
 * @Param
 * @return
 **/
public abstract interface UserRepository extends CrudRepository<User,Long>
{

}
