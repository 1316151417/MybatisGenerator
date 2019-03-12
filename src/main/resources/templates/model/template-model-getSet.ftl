    <#list table.columnList as column>
    public ${column.typeName} get${column.propertyName?cap_first}() {
        return ${column.propertyName};
    }
    public void set${column.propertyName?cap_first}(${column.typeName} ${column.propertyName}) {
        this.${column.propertyName} = ${column.propertyName};
    }
    </#list>
