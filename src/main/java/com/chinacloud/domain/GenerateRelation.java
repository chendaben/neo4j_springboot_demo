package com.chinacloud.domain;/**
 * Created by Administrator on 2017/12/6.
 */

import com.fasterxml.jackson.annotation.JsonBackReference;
import io.swagger.annotations.ApiModelProperty;
import org.neo4j.ogm.annotation.*;

import java.util.ArrayDeque;

/**
 * @author cyq
 * @date 2017/12/06
 **/
@RelationshipEntity(type = "generate")
public class GenerateRelation {

    @GraphId
    private Long id;

    @StartNode
    private Node startTable;

    @EndNode
    private Node endTable;

    @Property
    private String key;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ApiModelProperty(name = "键",example = "filed")
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @JsonBackReference
    public Node getStartTable() {
        return startTable;
    }

    @JsonBackReference
    public void setStartTable(Node startTable) {
        this.startTable = startTable;
    }

    public Node getEndTable() {
        return endTable;
    }

    public void setEndTable(Node endTable) {
        this.endTable = endTable;
    }
}
