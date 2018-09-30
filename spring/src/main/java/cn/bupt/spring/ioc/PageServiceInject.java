package cn.bupt.spring.ioc;

/**
 * @Author: lichong04
 * @Date: Created in 下午6:59 2018/9/24
 */
public abstract class PageServiceInject {

    public void save(){
        PageDao pageDao = getPageDao();
        System.out.println(pageDao);
        pageDao.save();
    }
    public abstract PageDao getPageDao();
}
