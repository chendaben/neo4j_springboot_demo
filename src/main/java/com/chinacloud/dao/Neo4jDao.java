package com.chinacloud.dao;
import com.chinacloud.domain.Node;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;


/**
 * @author cyq
 * @date 2017/11/29
 **/

@Repository
public interface Neo4jDao extends Neo4jRepository<Node,Long> {

    /**
     * 创建关系
     * @param beginNode
     * @param endNode
     * @param relation
     */
    @Query("MATCH (t:table),(d:datasource) WHERE t.name = {0} AND d.name ={1} CREATE (d)-[r:REL {2}]->(t) RETURN r")
    void inserttableAndDataSourceRelation(String beginNode,String endNode, String relation);


    /**
     * 根据id查询结点属性
     * @param id
     * @return
     */
    @Query("match (s:table{id:{0}}) return s")
    Node getNodeInfo(String id);

    /**
     * 查询所有结点
     * @return
     */
    @Override
    Iterable<Node> findAll();


    /**
     * 创建表结点
     * @param name
     * @param type
     */
    @Query("create (n:table{name:{0},type:{1}) return n")
    void insertTabletNode(String name,String type);

    /**
     * 删除结点
     * @param node
     */
    @Override
    void delete(Node node);
}
