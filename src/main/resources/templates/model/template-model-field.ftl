    <#list table.columnList as column>
    private ${column.typeName} ${column.propertyName};
    </#list>
