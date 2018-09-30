package cn.bupt.spring.ioc;

/**
 * @Author: lichong04
 * @Date: Created in 下午4:16 2018/9/24
 */
public class UserFactory {

    public static UserService buildUser(Integer id, String name){
        return new UserService(id,name);
    }

    public UserService getInstance(Integer id, String name){
        return new UserService(id,name);
    }
}
