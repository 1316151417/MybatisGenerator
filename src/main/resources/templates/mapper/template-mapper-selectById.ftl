    <select id="selectById" parameterType="${table.primaryKey.typeNamespace}" resultMap="BaseResultMap">
        select <include refid="Base_Column_List" />
        from ${table.name}
        where ${table.primaryKey.name} = ${"#"}{${table.primaryKey.propertyName},jdbcType=${table.primaryKey.jdbcType}}
    </select>

