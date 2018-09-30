package cn.bupt.springmvc.handler.request_mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lichong04
 * @Date: Created in 下午11:26 2018/9/19
 */
@RestController
@RequestMapping("/user2")
public class UserRequestMapping {


    @GetMapping("/list")
    public Object getUser(){
        return true;
    }


}
