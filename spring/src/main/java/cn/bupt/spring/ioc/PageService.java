package cn.bupt.spring.ioc;

/**
 * @Author: lichong04
 * @Date: Created in 下午6:45 2018/9/24
 */
public class PageService {

    //pageService依赖pageDao，这里我们利用spring帮我们将pageDao注入进来，而不是直接通过new PageDao()的方式来创建。
    PageDao pageDao;

    public PageService(){

    }

    public PageService(PageDao pageDao){
        this.pageDao = pageDao;
    }

    public void savePage(){
        pageDao.save();
    }

    public void setPageDao(PageDao pageDao) {
        this.pageDao = pageDao;
    }
}
