package com.student.dao;

import com.student.model.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserBean,Long> {

    @Query("select u from UserBean u where u.name like %:name%")
    List<UserBean> searchUserByName(String name);

    Optional<UserBean> findOneByEmail(String email);

    Optional<UserBean> findByEmail(String email);
}
