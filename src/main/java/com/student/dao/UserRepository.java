package com.student.dao;

import com.student.model.UserBean;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<UserBean, String> {

    @Query("select u from UserBean u where u.name like %:name%")
    List<UserBean> searchUserByName(String name);


}
