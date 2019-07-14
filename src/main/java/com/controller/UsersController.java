package com.controller;

import com.bean.Users;
import com.redisdao.MyRedisTempDao;
import com.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 16:09 2019/7/6
 */
@Controller
public class UsersController {

    @Resource(name = "usersServiceImp")
    UsersService usersService;

    @Resource(name = "myRedisTempDaoImp")
    MyRedisTempDao myRedisTempDao;
    /**
     * 注册用户
     *
     * @return
     */
    @RequestMapping("/addusers")
    public String addUsers(Users users, String verifyCode) {
        System.out.println("UsersController 注册，用户名  " + users.getUserName() + "  密码：  "
                + users.getUserPass() + "  手机号： " + users.getUserPhone() + "  验证码  "
                + verifyCode);

        // 1、获取输入的验证码与保存到redis里面的手机对应的验证码是否一致
        String redisTelnum = myRedisTempDao.getValue(users.getUserPhone());// 根据手机号码获取redis里面对应的值(验证码)
        if (redisTelnum == null || !redisTelnum.equals(verifyCode)) {// redisTelnum==null
            // 没有获取过验证码或验证码已经过期了,!redisTelnum.equals(telnum)输入的验证码和redis里面的验证码不一致
            return "register";
        }else{
            // 2、保存用户对象，并跳转到登陆的页面
            usersService.insert(users);
            return "login";
        }
    }
    /**
     * 用户登陆
     *
     * @return
     */
    @RequestMapping("/loginusers")
    public String loginUsers(HttpServletRequest req, Users users,
                             String userName_userPhone, String verifyCode) {
        users.setUserName(userName_userPhone);
        users.setUserPhone(userName_userPhone);

        System.out.println("UsersController 登录，用户名  " + users.getUserName() + "  密码：  "
                + users.getUserPass() + "  手机号： " + users.getUserPhone() + "  用户输入的验证码  "
                + verifyCode);

        // 1、验证输入的验证码和session里面生成的验证码是不是一致
        String loginrandom = req.getSession().getAttribute("verifyCode").toString();// 获取session里面存储的验证码
        System.out.println("UsersController session 中的验证码  " + loginrandom);
        if (loginrandom.equals(verifyCode)) {// 验证码一致
            // 2、验证用户名或手机和密码是不是匹配
            Users u = usersService.selectByUsers(users);
            if (u != null) {// 登陆成功
                req.getSession().setAttribute("nowuser", u);// 登陆成功，把当前登陆用户存入到session里面，后面其他的资源都能够获取当当前登陆的这个用户
                return "redirect:showgoodslist?page=1";// 重定向
            } else {// 重新登陆
                return "login";
            }
        } else {
            return "login";
        }
    }


    @RequestMapping("/quit")
    public String quit(HttpServletRequest request) {
        request.getSession().invalidate();
        return "redirect:showgoodslist?page=1";
    }
}
