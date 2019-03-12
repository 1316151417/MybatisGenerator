    <select id="countByCondition" parameterType="${table.modelTypeNamespace}" resultMap="java.lang.Long">
        select count(*)
        from ${table.name}
        <where>
        <#list table.columnList as column>
            <if test="${column.propertyName} != null">
                and ${column.name} = ${"#"}{${column.propertyName},jdbcType=${column.jdbcType}}
            </if>
        </#list>
        </where>
    </select>
