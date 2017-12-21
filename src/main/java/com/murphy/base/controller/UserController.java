package com.murphy.base.controller;

import com.murphy.base.model.Menu;
import com.murphy.base.model.User;
import com.murphy.base.service.MenuService;
import com.murphy.base.service.UserService;
import com.murphy.utils.LoginAttribute;
import com.murphy.utils.LoginUtils;
import com.murphy.utils.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 杨成雨
 * @create 2017-12-17 11:13
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private MenuService menuService;

    @RequestMapping("/login")
    public ModelAndView login(String loginname,String password,HttpServletRequest request){
        if(loginname == null || password == null){
            return new ModelAndView("/mup-login.jsp");
        }else{
            User user = userService.getUserByLoginName(loginname);
            if(user == null ){
                return new ModelAndView("/mup-login.jsp");
            }else{
                String tmpPassword = MD5.createPassword(password);
                if(!tmpPassword.equals(user.getPassword())){
                    return new ModelAndView("/mup-login.jsp");
                }else{
                    LoginUtils.setSession(request,user);
                    List<Menu> list = menuService.getMenuList(null);
                    request.getSession().setAttribute(LoginAttribute.SESSION_MENU_USER,list);
                    return new ModelAndView("/user/main");
                }
            }
        }
    }

    @RequestMapping("/main")
    public ModelAndView main(HttpServletRequest request){
        HttpSession session = request.getSession();
        String loginName = session.getAttribute(LoginAttribute.SESSION_LOGIN_NAME).toString();
        String userId = session.getAttribute(LoginAttribute.SESSION_USER_ID).toString();
        if(loginName == null){
            return new ModelAndView("/mup-login.jsp");
        }else {
            User user = userService.getUserByLoginName(loginName);
            LoginUtils.setSession(request,user);
            request.setAttribute("menuList",session.getAttribute(LoginAttribute.SESSION_MENU_USER));
            request.setAttribute("user",user);
        }
        return new ModelAndView("/jsp/base/index.jsp");
    }

}
