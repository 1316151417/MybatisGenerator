    <update id="updateById" parameterType="${table.modelTypeNamespace}">
        update ${table.name}
        <set>
            <#list table.columnList as column>
            <if test="${column.propertyName} != null">
                ${column.name} = ${"#"}{${column.propertyName},jdbcType=${column.jdbcType}},
            </if>
            </#list>
        </set>
        where ${table.primaryKey.name} = ${"#"}{${table.primaryKey.propertyName},jdbcType=${table.primaryKey.jdbcType}}
    </update>
