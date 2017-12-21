package com.murphy.utils;

import com.murphy.base.model.User;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.Locale;

/**
 * @author 杨成雨
 * @create 2017-12-17 11:29
 */
public class LoginUtils {


    /**
     * session 设置
     * @param request
     * @param user
     */
    public static void setSession(HttpServletRequest request,User user){
        //User user = userService.getUserByLoginName(loginName, false, true);
        HttpSession session = setDefaultLocale(request,user);
        //isExchangeSystem(session,user);
        session.setAttribute(LoginAttribute.SESSION_USER_ID, user.getId());
        session.setAttribute(LoginAttribute.SESSION_LOGIN_NAME, user.getLoginname());
        session.setAttribute(LoginAttribute.SESSION_USER_NAME, user.getName());
//        if(user.getMainDept()!=null)
//            session.setAttribute(LoginAttribute.SESSION_MAINDEPT_ID,user.getMainDept().getId());
//        else
            session.setAttribute(LoginAttribute.SESSION_MAINDEPT_ID,Long.valueOf(-1));
//        if (!loginName.equals("admin")) {
//            session.setAttribute(LoginAttribute.SESSION_DEPT_TITLE, user.getMainDept().getName());
//            session.setAttribute(LoginAttribute.SESSION_DEPT_ALIAS, user.getMainDept().getAlias());
//        }
        setHeadImgToSession(session,user,request);
    }
    private static HttpSession setDefaultLocale(HttpServletRequest request,User user) {
        Locale locale = (Locale) request.getSession().getAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME);
        HttpSession session = request.getSession();
        if (locale == null) {
            //String defaultLocale = PropertyGetter.getString("common", "default.locale", "cn");
            String defaultLocale =  "cn";//user.getUserProFile().getLangKey();
            if (defaultLocale.equals("cn"))
                session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.CHINA);
            else if (defaultLocale.equals("en"))
                session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.US);
        }

        session.setAttribute("locale",
                session.getAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME));

        return session;
    }

    //头像名称设置到session中以及肤色设置
    private static void setHeadImgToSession(HttpSession session,User user,HttpServletRequest request){
        //session.setAttribute("themeKey", user.getUserProFile().getThemeKey());
        String headImg=user.getHeadImage();
        if(headImg==null || "".equals(headImg)){
             session.setAttribute(LoginAttribute.SESSION_HEAD_IMG, "");
        }else{
            //判断用户头像是否存在
            boolean isHeadImgExist = isHeadImgExist(headImg, request);

            if(isHeadImgExist){
                session.setAttribute(LoginAttribute.SESSION_HEAD_IMG, user.getHeadImage());
            }else{
                session.setAttribute(LoginAttribute.SESSION_HEAD_IMG, "");
            }
        }
    }

    /**判断图片在服务器上是否存在
     * author zhanglw
     * @param imgName	名字格式,例： /sys/head/User/UserHeadImage/zhanglw.jpg 图片格式{"jpg","gif","png","jpeg","bmp"}
     * @param request  用传过来的request通过request.getSession().getServletContext().getRealPath("")此语句找到服务器所在盘符路径
     * @return
     */
    public static boolean isHeadImgExist(String imgName,HttpServletRequest request){
        if(StringUtils.isEmpty(imgName) || StringUtils.isBlank(imgName) || request == null){
            return false;
        }
        String imgRootPath = request.getSession().getServletContext().getRealPath("");
        File file=new File(imgRootPath+imgName);
        if(file.exists()){
            return true;
        }
        return false;
    }




}
