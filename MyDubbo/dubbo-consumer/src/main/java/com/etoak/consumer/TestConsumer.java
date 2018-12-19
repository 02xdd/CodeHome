package com.etoak.consumer;

import com.etoak.bean.User;
import com.etoak.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by li2xdd on 2018/12/19/0019.
 */
public class TestConsumer {
    public static void main(String[] args) {

        ApplicationContext ac =
                new ClassPathXmlApplicationContext("consumer.xml");

        UserController us = (UserController)ac.getBean("userController");

        User user = new User();
        user.setName("李继鹏222");
        user.setAge(3);

        String result = us.add(user);
        System.out.println(result);

    }



}
