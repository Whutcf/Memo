package com.smic.springboot.controller;

import com.smic.springboot.domain.User;
import com.smic.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Description
 * @Author Cai Feng
 * @Date 2018/12/11 21:49
 * @Param
 * @return
 **/
@RestController
@RequestMapping({"/users"})
public class UserController {
    @Autowired
    private UserRepository userRepository;

    /**
     * @return org.springframework.web.servlet.ModelAndView
     * @Description 获取用户列表
     * @Date 2018/12/11 21:00
     * @Param [model]
     **/
    @GetMapping
    public ModelAndView list(Model model) {
        model.addAttribute("userList", this.userRepository.listUsers());
        model.addAttribute("title", "用户管理");
        return new ModelAndView("users/list", "userModel", model);
    }


    /**
     * @Description 获取用户个人信息
     * @Date 2018/12/11 21:00
     * @Param [id, model]
     * @return org.springframework.web.servlet.ModelAndView
     **/
    @GetMapping({"{id}"})
    public ModelAndView view(@PathVariable("id") Long id, Model model) {
        User user = this.userRepository.getUserById(id);
        model.addAttribute("user", user);
        model.addAttribute("title", "查看用户");
        return new ModelAndView("users/view", "userModel", model);
    }


    /**
     * @return org.springframework.web.servlet.ModelAndView
     * @Description 获取创建表单的页面
     * @Date 2018/12/11 20:59
     * @Param [model]
     **/
    @GetMapping({"/form"})
    public ModelAndView createForm(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("title", "创建用户");
        return new ModelAndView("users/form", "userModel", model);
    }

    /**
     * @return org.springframework.web.servlet.ModelAndView
     * @Description 保存用户信息
     * @Date 2018/12/11 20:59
     * @Param [user]
     **/
    @PostMapping
    public ModelAndView saveOrUpdateUser(User user) {
        user = this.userRepository.saveOrUpdateUser(user);
        return new ModelAndView("redirect:/users");
    }

    /**
     * @return org.springframework.web.servlet.ModelAndView
     * @Description //删除用户信息
     * @Date 2018/12/11 20:58
     * @Param [id]
     **/
    @GetMapping(value = "delete/{id}")
    public ModelAndView delete(@PathVariable("id") Long id) {
        userRepository.deleteUser(id);
        return new ModelAndView("redirect:/users");
    }

    /**
     * @return org.springframework.web.servlet.ModelAndView
     * @Description //修改用户信息
     * @Date 2018/12/11 20:57
     * @Param [id, model]
     **/
    @GetMapping(value = "modify/{id}")
    public ModelAndView modifyForm(@PathVariable("id") Long id, Model model) {
        User user = userRepository.getUserById(id);
        model.addAttribute("user", user);
        model.addAttribute("title", "修改用户");
        return new ModelAndView("users/form", "userModel", model);
    }
}

/* Location:              E:\Springboot-Learning\thymeleaf-in-action\build\classes\java\main\!\com\smic\springboot\controller\UserController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */