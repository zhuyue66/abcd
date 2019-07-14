package com.controller;

import com.redisdao.MyRedisTempDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 11:02 2019/7/6
 */
@Controller
public class GetPhMessageController {

    @Resource(name="myRedisTempDaoImp")
    MyRedisTempDao myRedisTempDao;

    /**
     * 根据手机号码发送验证码
     *
     * @return
     */
    @RequestMapping("/sendmessagebyph")
    public void sendMessageByPh(String telnum, HttpServletResponse res) {
        // telnum 手机号码
        // 1、生成一个4位数字的随机数字
        int r=new Random().nextInt(9000)+1000;

        // 2、以手机号码为键，4位的随机数字为值，保存到redis里面，且设置时间为60秒
        myRedisTempDao.setValue(telnum, r + "", 60);

        // 3、把4位的随机数字发送到手机号码
        try {
            res.getWriter().print(1);//发送成功返回一个1
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
