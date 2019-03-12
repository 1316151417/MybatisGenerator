    <sql id="Base_Column_List">
        <#list table.columnList as column>
            <#if column?index == 0>
        ${column.name}
            <#else>
        ,${column.name}
            </#if>
        </#list>
    </sql>
