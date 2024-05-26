package com.student.controller;

import com.student.dao.UserService;
import com.student.dto.UserDto;
import com.student.model.UserBean;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/user")
@Controller
public class UserContoller {
    @Autowired
    private UserService userService;

    @Autowired
    private final ModelMapper modelMapper;

    public UserContoller(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
    @GetMapping("/login")
    public String login() {

        return "login";
    }

    @GetMapping(  "/register")
    public ModelAndView register() {

        return new ModelAndView("register", "userDto", new UserDto());
    }

    @PostMapping(value="/register")
    public String register(@ModelAttribute("userDto")@Validated UserDto dto, BindingResult bs, ModelMap model) {
        if(bs.hasErrors()) {
            return "register";
        }

        userService.save(modelMapper.map(dto, UserBean.class));
        return "redirect:/login";
    }

    @GetMapping(  "/adminRegister")
    public ModelAndView adminRegister() {

        return new ModelAndView("adminRegister", "userDto", new UserDto());
    }


    @PostMapping(value="/adminRegister")
    public String adminRegister(@ModelAttribute("userDto")@Validated UserDto dto, BindingResult bs, ModelMap model) {
        if(bs.hasErrors()) {
            return "adminRegister";
        }

        userService.save(modelMapper.map(dto, UserBean.class));
        return "redirect:/adminRegister";
    }
}
