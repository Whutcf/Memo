package com.smic.springboot.repository;

import com.smic.springboot.domain.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Repository;

/**
 * @Description UserRepository的实现类
 * @Date 2018/12/11 21:47
 * @Param
 * @return
 **/
@Repository
public class UserRepositoryImpl
        implements UserRepository {
    private static AtomicLong counter = new AtomicLong();

    private final ConcurrentMap<Long, User> userMap = new ConcurrentHashMap();


    @Override
    public User saveOrUpdateUser(User user) {
        Long id = user.getId();
        if (id == null) {
            id = Long.valueOf(counter.incrementAndGet());
            user.setId(id);
        }
        this.userMap.put(id, user);
        return user;
    }

    @Override
    public void deleteUser(Long id) {
        this.userMap.remove(id);
    }

    @Override
    public User getUserById(Long id) {
        if (this.userMap.containsKey(id)) {
            User user = (User) this.userMap.get(id);
            return user;
        }
        return null;
    }

    @Override
    public List<User> listUsers() {
        List<User> userList = new ArrayList();
        Collection<User> users = this.userMap.values();
        userList.addAll(users);
        return userList;
    }
}


/* Location:              E:\Springboot-Learning\thymeleaf-in-action\build\classes\java\main\!\com\smic\springboot\repository\UserRepositoryImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */