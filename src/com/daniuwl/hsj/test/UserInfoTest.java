package com.daniuwl.hsj.test;

import hsj.czy.mybatisframe.bean.Pager;
import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daniuwl.hsj.entity.UserInfo;
import com.daniuwl.hsj.service.UserInfoService;

public class UserInfoTest {

    static Logger          logger = Logger.getLogger(UserInfoTest.class);

    static UserInfoService service;

    public static void main(String[] args) {
        logger.info("初始化spring。。。");

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(
                                                                               new String[] { "classpath*:applicationContext.spring.xml" });
        logger.info("总共加载bean数量：" + ac.getBeanDefinitionNames().length);
        logger.info("finished.");
        service = (UserInfoService) ac.getBean("userInfoServiceImpl");
        update();
        findPager();
        login();
        ac.close();
    }

    public static void add() {
        logger.info("-----------------调用新增方法----------------");
        UserInfo u = new UserInfo();
        u.setUserName("a314170122");
        logger.info("新增成功：返回主键id为：" + service.save(u));
    }

    public static void findPager() {
        logger.info(JSONObject.fromObject(service.findPager(new Pager())));
    }

    public static void update() {
        UserInfo u = service.get("1d95058cffcb4d389eb8df90ffeb3ef5");
        u.setMobile("13321185508");
        service.update(u);
        logger.info("用户信息更新成功！");
    }

    public static void login() {
        try {
            logger.info("尝试正确的登录方式：" + JSONObject.fromObject(service.login("a314170122", "111111")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            logger.info("尝试登录不存在的用户：" + JSONObject.fromObject(service.login("aaaaa", "111111")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            logger.info("尝试错误的密码登录：" + JSONObject.fromObject(service.login("a314170122", "123123")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
