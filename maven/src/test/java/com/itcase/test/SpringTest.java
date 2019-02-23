package com.itcase.test;


import com.itcase.dao.ItemsDao;
import com.itcase.domain.Items;
import com.itcase.service.ItemsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZhangBo
 * @version 1.0
 * @ClassName SpringTest
 * @Description TODO
 * @date 2019/2/22 21:21
 */
public class SpringTest {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*ItemsDao itemsDao = ac.getBean(ItemsDao.class);
        Items items = itemsDao.findById(1);
        System.out.println(items.getName());*/

        ItemsService s = ac.getBean(ItemsService.class);
        Items items = s.findById(1);
        System.out.println(items.getName());
    }
}
