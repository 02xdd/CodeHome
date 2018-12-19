package com.etoak.provider;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by li2xdd on 2018/12/19/0019.
 */
public class TestProvider {
    public static void main(String[] args) {
        ApplicationContext ac =
                new ClassPathXmlApplicationContext("provider.xml");

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
