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
     * 创建源
     * @param name
     * @param type
     */
    @Query("create (n:datasource{name:{1},type:{2})  return  n")
    void insertNode(String name,String type);




}
