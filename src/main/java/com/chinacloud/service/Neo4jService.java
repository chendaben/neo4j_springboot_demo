package com.chinacloud.service;

import com.alibaba.fastjson.JSON;
import com.chinacloud.dao.Neo4jDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

/**
 * @author Administrator
 * @date 2017/11/30
 **/
@Service
public class Neo4jService {

    @Autowired
    private Neo4jDao neo4jDao;

    public void getAll(){
//        neo4jDao.inserttableAndDataSourceRelation("Hello World!","datasource3","have");
        Iterable<Object> s= neo4jDao.getAll();
        System.out.println("===="+s);
    }
}
