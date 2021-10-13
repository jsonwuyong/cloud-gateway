package com.wu.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuyong
 * Description:
 * Created: sunny
 * Email: nengliang0816@outlook.com
 * Date: 2021-09-15 22:58
 */
@RestController
public class TestGateWayController {

    @GetMapping("/api")
    public String testApi(){

        return "吴永";
    }
}
