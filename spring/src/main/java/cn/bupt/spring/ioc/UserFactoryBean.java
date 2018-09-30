package cn.bupt.spring.ioc;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: lichong04
 * @Date: Created in 下午4:26 2018/9/24
 */
public class UserFactoryBean implements FactoryBean<UserService> {

    private Integer id;
    private String name;

    @Override
    public UserService getObject() throws Exception {
        return new UserService(id,name);
    }

    @Override
    public Class<?> getObjectType() {
        return UserService.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
