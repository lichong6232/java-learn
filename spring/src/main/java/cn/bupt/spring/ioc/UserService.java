package cn.bupt.spring.ioc;

/**
 * @Author: lichong04
 * @Date: Created in 下午3:48 2018/9/24
 */
public class UserService {



    private Integer id;
    private String name;

    public UserService(){

    }

    public UserService(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public void init(){
        System.out.println("实例创建之前进行初始化操作");
    }

    public void destory(){
        System.out.println("实例销毁之前执行");
    }


}
