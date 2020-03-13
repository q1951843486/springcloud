package com.meiya.platform.controller;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description
 * @ClassName LoginController
 * @Author Administrator
 * @date 2019.12.31 15:08
 */
@Controller
public class LoginController {


    @RequestMapping(value = "/")
    public String doLogin(){



        return "login";
    }


    @RequestMapping(value = "/login")
    public String login(@RequestParam(value = "userName")String userName,
                        @RequestParam(value = "password")String password, Model model){

        if (ObjectUtils.allNotNull(userName,password)){

            model.addAttribute("msg","请输入账户和密码");
            return "login";
        }





        return "index";
    }


}
