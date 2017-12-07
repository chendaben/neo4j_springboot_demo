package com.chinacloud.domain;

import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.codec.StringDecoder;
import org.springframework.context.annotation.Bean;

/**
 * @author cyq
 * @date 2017/12/06
 **/
public class Node {

    private String  id;
    private String name;
    private String type;
    private String datasource;
    private Integer port;
    private String database;
    private String model;

    @ApiModelProperty(name = "id(type/datasource:port/database_model_name)" , example =
            "mysql//172.16.50.21:3306/test_test_student")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    @ApiModelProperty(name = "表所属模式", example = "test",required = false)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
