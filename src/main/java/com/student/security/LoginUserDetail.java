package com.student.security;


import com.student.model.UserBean;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
public class LoginUserDetail implements UserDetails {
	private static final long serialVersionUID = 1L;

	private final UserBean userBean;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        System.out.println("role");
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(userBean.getRole()));
        return authorities;
    }

    @Override
    public String getPassword() {
        return userBean.getPassword();
    }

    @Override
    public String getUsername() {
        return userBean.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return userBean.isDeleted();
    }
   
}
