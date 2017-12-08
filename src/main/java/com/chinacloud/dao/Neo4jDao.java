package com.chinacloud.dao;
import com.chinacloud.domain.Node;
import com.chinacloud.domain.RelationAttribute;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;


/**
 * @author Administrator
 * @date 2017/11/29
 **/

@Repository
public interface Neo4jDao  extends Neo4jRepository<Node,Long> {

    /**
     * 查找
     * @return
     */
    @Query("create (n:datasource4{name:'datasource3',type:'mysql_datasource'})  return  n")
    void getGraph();

    /**
     * 创建源结点
     * @param name
     * @param type
     */
    @Query("create (n:datasource{name:{0},type:{1}) return n")
    void insertDataSourceNode(String name,String type);

    /**
     * 创建表结点
     * @param name
     * @param type
     */
    @Query("create (n:table{name:{0},type:{1}) return n")
    void inserTabletNode(String name,String type);

    /**
     * 创建表与数据源之间的关系
     * @param beginNode
     * @param endNode
     * @param relation
     */
    @Query("MATCH (t:table),(d:datasource) WHERE t.name = {0} AND d.name ={1} CREATE (d)-[r:REL {2}]->(t) RETURN r")
    void inserttableAndDataSourceRelation(String beginNode,String endNode, String relation);

    //TODO 批量创建结点和关系


    //TODO 查询

    @Query("match (s:table) return s")
    Stream<Node> getAllTable();


    /**
     * 根据id查询结点属性
     * @param id
     * @return
     */
    @Query("match (s:table{id:{0}}) return s")
    Node findByNodeName(String id);

    @Query("match [r] where id(r)= {0} return r")
    RelationAttribute findByRelationId(Long id);





}
