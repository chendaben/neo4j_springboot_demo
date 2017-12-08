package com.chinacloud.service;

import com.chinacloud.dao.Neo4jDao;
import com.chinacloud.domain.Node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

/**
 * @author Administrator
 * @date 2017/11/30
 **/
@Service
public class Neo4jService {

    @Autowired
    private Neo4jDao neo4jDao;

    public void getAll(){
        System.out.println("====");
    }
}
