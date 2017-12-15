package com.chinacloud.controller;/**
 * Created by Administrator on 2017/11/30.
 */

import com.chinacloud.domain.Node;
import com.chinacloud.domain.GenerateRelation;
import com.chinacloud.service.Neo4jService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;

/**
 * @author cyq
 * @date 2017/11/30
 **/
@RestController
@Api(value = "/api", description = "neo4j API列表")
@RequestMapping(value = "/v2/api/graph")
public class Neo4jController {

    @Autowired
    private Neo4jService neo4jService;

    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "创建api")
    public void create(@ApiParam(value = "起始结点") @RequestBody Node beginNode,
                       @ApiParam(value = "结束结点") @RequestBody Node endNode,
                       @ApiParam(value = "关系名称") @RequestParam String relationName,
                       @ApiParam(value = "关系属性") @RequestBody List<GenerateRelation> generateRelationList){

    }

    @RequestMapping(method = RequestMethod.DELETE)
    @ApiOperation(value = "删除api")
    public void delete(@ApiParam(value = "结点tableId列表") @RequestBody List<String> tableIds){

    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "获取整个图api")
    public Iterable<Node> getAll(){
        Iterable<Node> nodes=neo4jService.getAll();

        return nodes;
    }

    @RequestMapping(value = "/node/{id}",method = RequestMethod.GET)
    @ApiOperation(value = "获取单个结点属性api")
    public Node getNodeInfo(@ApiParam(value = "id") @RequestParam  String id){
        Node node = neo4jService.getNodeInfo(id);
        return node;
    }

    @RequestMapping(value = "/relation",method = RequestMethod.GET)
    @ApiOperation(value = "获取关系属性api")
    public void getRelationInfo(
            @ApiParam(value = "起始结点ID") @RequestParam  String startNodeId,
            @ApiParam(value = "结束结点ID") @RequestParam  String endNodeId,
            @ApiParam(value = "关系名称") @RequestParam  String name){

    }

    @RequestMapping(value = "/by-relation-name",method = RequestMethod.GET)
    @ApiOperation(value = "根据关系名称获取图")
    public void getGraphByRelationName(@ApiParam(value = "关系名称") @RequestParam  String name){

    }

    @RequestMapping(value = "/by-node-attr",method = RequestMethod.GET)
    @ApiOperation(value = "根据结点属性获取相关图")
    public void getGraphByNodeAttr(@ApiParam(value = "属性列表") @RequestBody  String [] attr){

    }




}
