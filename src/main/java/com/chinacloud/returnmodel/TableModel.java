package com.chinacloud.returnmodel;/**
 * Created by Administrator on 2017/12/11.
 */

import com.chinacloud.domain.Node;
import com.chinacloud.domain.GenerateRelation;
import org.neo4j.ogm.annotation.Property;
import org.springframework.data.neo4j.annotation.QueryResult;

/**
 * @author Administrator
 * @date 2017/12/11
 **/
@QueryResult
public class TableModel {

    @Property
    Iterable<Node> nodes;

    @Property
    Iterable<GenerateRelation> relations;



}
