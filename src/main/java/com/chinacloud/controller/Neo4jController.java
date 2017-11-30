package com.chinacloud.controller;/**
 * Created by Administrator on 2017/11/30.
 */

import com.chinacloud.service.Neo4jService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @date 2017/11/30
 **/
@RestController
@RequestMapping(value = "/neo4j")
public class Neo4jController {

    @Autowired
    private Neo4jService neo4jService;

    @RequestMapping(method = RequestMethod.GET)
    public void test(){
        neo4jService.getAll();
    }
}
