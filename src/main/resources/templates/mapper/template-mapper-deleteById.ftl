    <delete id="deleteById" parameterType="${table.primaryKey.typeNamespace}">
        delete from ${table.name}
        where ${table.primaryKey.name} = ${"#"}{${table.primaryKey.propertyName},jdbcType=${table.primaryKey.jdbcType}}
    </delete>
