package com.student.dao;

import com.student.model.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepo;

    public void save(UserBean userBean) {
        userRepo.save(userBean);
    }
}
