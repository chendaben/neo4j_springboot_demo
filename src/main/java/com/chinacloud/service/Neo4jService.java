package com.chinacloud.service;

import com.chinacloud.dao.Neo4jDao;
import com.chinacloud.domain.Node;
import com.chinacloud.domain.StartTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @date 2017/11/30
 **/
@Service
public class Neo4jService {

    @Autowired
    private Neo4jDao neo4jDao;

    public Iterable<StartTable> getAll(){
        Iterable<StartTable> iterable= neo4jDao.findTest();
        System.out.println("===="+iterable);
        return iterable;
    }
}
