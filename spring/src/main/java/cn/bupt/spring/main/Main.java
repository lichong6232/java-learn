package cn.bupt.spring.main;

import cn.bupt.spring.ioc.PageService;
import cn.bupt.spring.ioc.PageServiceInject;
import cn.bupt.spring.ioc.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: lichong04
 * @Date: Created in 下午3:49 2018/9/24
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        /*PageService pageService = applicationContext.getBean(PageService.class);
        pageService.savePage();*/
        PageServiceInject pageServiceInject = applicationContext.getBean(PageServiceInject.class);
        pageServiceInject.save();
        pageServiceInject.save();
    }
}
