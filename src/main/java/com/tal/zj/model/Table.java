package com.tal.zj.model;

import com.tal.zj.util.NameUtil;

import java.util.List;

/**
 * @Author ZhouJie
 * @Date 2019/1/30 17:45
 * @Description 表
 */
public class Table {
    //model默认包名
    private static final String DEFAULT_MODEL_PACKAGE_NAME = "model";
    //mapper默认包名
    private static final String DEFAULT_MAPPER_PACKAGE_NAME = "mapper";
    //mapper默认包名
    private static final String DEFAULT_MAPPER_SUFFIX_NAME = "Mapper";

    //表名
    private String name;
    //表字段
    private List<Column> columnList;
    //包名
    private String basePackage;

    public Table(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Column> getColumnList() {
        return columnList;
    }

    public void setColumnList(List<Column> columnList) {
        this.columnList = columnList;
    }

    public String getBasePackage() {
        return basePackage;
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }

    //获取model名称
    public String getModelName() {
        return NameUtil.underlineToHump(name);
    }

    //获取mapper名称
    public String getMapperName() {
        return new StringBuilder(getModelName()).append(DEFAULT_MAPPER_SUFFIX_NAME).toString();
    }

    //获取model类型名称
    public String getModelTypeName() {
        return NameUtil.uppercaseFirstChar(getModelName());
    }

    //获取mapper类型名称
    public String getMapperTypeName() {
        return NameUtil.uppercaseFirstChar(getMapperName());
    }

    //获取model的包名
    public String getModelPackageName() {
        return new StringBuilder(basePackage).append(".").append(DEFAULT_MODEL_PACKAGE_NAME).toString();
    }

    //获取mapper的包名
    public String getMapperPackageName() {
        return new StringBuilder(basePackage).append(".").append(DEFAULT_MAPPER_PACKAGE_NAME).toString();
    }

    //获取model类型命名空间
    public String getModelTypeNamespace() {
        return new StringBuilder(getModelPackageName()).append(".").append(getModelTypeName()).toString();
    }

    //获取mapper类型命名空间
    public String getMapperTypeNamespace() {
        return new StringBuilder(getMapperPackageName()).append(".").append(getMapperTypeName()).toString();
    }

    //获取主键
    public Column getPrimaryKey() {
        for (Column column : columnList) {
            if (column.getPrimaryKey()) {
                return column;
            }
        }
        return null;
    }
}
