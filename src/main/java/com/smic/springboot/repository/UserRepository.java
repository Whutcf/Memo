package com.smic.springboot.repository;

import com.smic.springboot.domain.User;
import java.util.List;

/**
 * @author cai feng
 */
public abstract interface UserRepository
{
  /**
   * @Description //保存或修改用户的接口
   * @Date 2018/12/11 21:45
   * @Param [user]
   * @return com.smic.springboot.domain.User
   **/
  public abstract User saveOrUpdateUser(User user);

  /**
   * @Description 按ID删除用户
   * @Date 2018/12/11 21:46
   * @Param [id]
   * @return void
   **/
  public abstract void deleteUser(Long id);

  /**
   * @Description 根据ID获取用户
   * @Date 2018/12/11 21:46
   * @Param [id]
   * @return com.smic.springboot.domain.User
   **/
  public abstract User getUserById(Long id);

  /**
   * @Description 获取用户清单
   * @Date 2018/12/11 21:47
   * @Param []
   * @return java.util.List<com.smic.springboot.domain.User>
   **/
  public abstract List<User> listUsers();
}


/* Location:              E:\Springboot-Learning\thymeleaf-in-action\build\classes\java\main\!\com\smic\springboot\repository\UserRepository.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */