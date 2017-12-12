package com.chinacloud.service;

import com.chinacloud.dao.Neo4jDao;
import com.chinacloud.domain.Node;
import com.chinacloud.returnmodel.TableModel;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @date 2017/11/30
 **/
@Service
public class Neo4jService {

    @Autowired
    private Neo4jDao neo4jDao;

    public Iterable<Node> getAll(){
        Iterable<Node> nodes=neo4jDao.findAll();
        System.out.println("test"+nodes);
        return nodes;
    }


    public Node getNodeInfo(String id){
        return neo4jDao.getNodeInfo(id);
    }

    public void save(){
        Node node = new Node();

//        node.setGenerateRelations();
    }
}
