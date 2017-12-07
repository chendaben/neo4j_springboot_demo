package com.chinacloud.dao;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Administrator
 * @date 2017/11/29
 **/

@Repository
public interface Neo4jDao  extends GraphRepository<Object> {

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


    @Query(value = "match (n) return n")
    Iterable<Object> getAll();
    //TODO 统计





}
