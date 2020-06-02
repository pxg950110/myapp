package com.pxg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 2020/6/2  16:33
 * </p>
 * <p>
 * @author pxg
 * @emil pxg950110@163.com
 * @Date 2020/6/2
 * @Version 1.0.0
 * @description </p>
 */
@RestController
public class Contorller {

    @GetMapping("/")
    public  String test(){
        return "aasdadsasd";
    }
}
