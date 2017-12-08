package com.chinacloud.dao;

import com.chinacloud.domain.Node;
import com.chinacloud.domain.RelationAttribute;
import org.springframework.data.neo4j.annotation.QueryResult;

/**
 * Created by Administrator on 2017/12/8.
 */
@QueryResult
public interface TableData {


    Iterable<Node> getSNodes();

    Iterable<RelationAttribute> getRelation();

    Iterable<Node> getENodes();

}
