package com.student.dao;

import com.student.model.UserBean;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    @Autowired
    UserRepository userRepo;

    @Autowired
    private final PasswordEncoder passwordEncoder;

    public void save(UserBean userBean) {
        userBean.setPassword(passwordEncoder.encode(userBean.getPassword()));
        userRepo.save(userBean);
    }
}
