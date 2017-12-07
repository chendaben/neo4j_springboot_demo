package com.chinacloud.domain;/**
 * Created by Administrator on 2017/12/6.
 */

import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayDeque;

/**
 * @author cyq
 * @date 2017/12/06
 **/

public class RelationAttribute {

    private String key;
    private Object[] value;

    @ApiModelProperty(name = "键",example = "filed")
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    @ApiModelProperty(name = "值",example = "[name1,name2]")
    public Object[] getValue() {
        return value;
    }

    public void setValue(Object[] value) {
        this.value = value;
    }
}