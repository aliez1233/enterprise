package com.my.test;

import com.my.dao.FileDao;
import com.my.vo.File;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FileTest {
    public static void main(String[] args) {
        ApplicationContext con=new ClassPathXmlApplicationContext("applicationContext.xml");
        FileDao ssm=con.getBean(FileDao.class);
        System.out.println(ssm.queryFileById(2));
    }

}
