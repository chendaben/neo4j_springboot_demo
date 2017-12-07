package com.chinacloud.domain;

import io.swagger.annotations.ApiModelProperty;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * @author cyq
 * @date 2017/12/06
 **/

@NodeEntity(label = "table")
public class EndTable {

    @GraphId
    private Long id;

//    @Index(unique=true,primary = true)
//    private String tableId;

    private String name;
    private String type;
    private String datasource;
    private Integer port;
    private String database;
//    private String model;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    @ApiModelProperty(name = "tableId(type/datasource:port/database_model_name)", example =
//            "mysql//172.16.50.21:3306/test_test_student")
//    public String getTableId() {
//        return tableId;
//    }
//
//    public void setTableId(String tableId) {
//        this.tableId = tableId;
//    }

    @ApiModelProperty(name = "表名称", example = "student")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ApiModelProperty(name = "类型", example = "mysql")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @ApiModelProperty(name = "数据源", example = "172.16.50.21")
    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    @ApiModelProperty(name = "端口", example = "3306")
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @ApiModelProperty(name = "数据库", example = "test")
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

//    @ApiModelProperty(name = "表所属模式", example = "test",required = false)
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
}
