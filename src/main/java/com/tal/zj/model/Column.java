package com.tal.zj.model;

import com.tal.zj.constants.ColumnType;
import com.tal.zj.util.NameUtil;

/**
 * @Author ZhouJie
 * @Date 2019/1/30 17:46
 * @Description 字段
 */
public class Column {
    //字段名
    private String name;
    //字段类型
    private ColumnType type;
    //是否是主键
    private Boolean primaryKey;

    public Column(String name, ColumnType type, Boolean primaryKey) {
        this.name = name;
        this.type = type;
        this.primaryKey = primaryKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ColumnType getType() {
        return type;
    }

    public void setType(ColumnType type) {
        this.type = type;
    }

    public Boolean getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(Boolean primaryKey) {
        this.primaryKey = primaryKey;
    }

    //获取属性名称
    public String getPropertyName() {
        return NameUtil.underlineToHump(name);
    }

    //获取jdbc类型
    public String getJdbcType() {
        switch (type) {
            case INTEGER: return "INTEGER";
            case FLOAT: return "DOUBLE";
            case STRING: return "VARCHAR";
            case DATE: return "TIMESTAMP";
            default: return null;
        }
    }

    //获取
    public String getTypeName() {
        switch (type) {
            case INTEGER: return "Integer";
            case FLOAT: return "Double";
            case STRING: return "String";
            case DATE: return "Date";
            default: return null;
        }
    }

    //获取命名空间
    public String getTypeNamespace() {
        switch (type) {
            case INTEGER: return "java.lang.Integer";
            case FLOAT: return "java.lang.Double";
            case STRING: return "java.lang.String";
            case DATE: return "java.util.Date";
            default: return null;
        }
    }
}
