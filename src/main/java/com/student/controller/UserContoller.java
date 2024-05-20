package com.student.controller;

import com.student.dao.UserService;
import com.student.dto.UserDto;
import com.student.model.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserContoller {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public ModelAndView setupaddbook() {
        return new ModelAndView("adminRegister", "userBean", new UserBean());
    }
    @PostMapping(value="/adminRegister")
    public String adminRegister(@ModelAttribute("UserDto")@Validated UserDto dto, BindingResult bs, ModelMap model) {
        if(bs.hasErrors()) {
            return "adminRegister";
        }
        UserBean bean=new UserBean();
        bean.setName(dto.getName());
        bean.setEmail(dto.getEmail());
        userService.save(bean);
        return "redirect:/adminRegister";
    }
}
