    <resultMap id="BaseResultMap" type="${table.modelTypeNamespace}">
        <#list table.columnList as column>
            <#if column.primaryKey>
        <id column="${column.name}" property="${column.propertyName}" jdbcType="${column.jdbcType}"/>
            <#else>
        <result column="${column.name}" property="${column.propertyName}" jdbcType="${column.jdbcType}"/>
            </#if>
        </#list>
    </resultMap>
