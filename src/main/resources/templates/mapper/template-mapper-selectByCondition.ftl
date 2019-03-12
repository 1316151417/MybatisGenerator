    <select id="selectByCondition" parameterType="${table.modelTypeNamespace}" resultMap="BaseResultMap">
        select <include refid="Base_Column_List" />
        from ${table.name}
        <where>
            <#list table.columnList as column>
            <if test="${column.propertyName} != null">
                and ${column.name} = ${"#"}{${column.propertyName},jdbcType=${column.jdbcType}}
            </if>
            </#list>
        </where>
    </select>

