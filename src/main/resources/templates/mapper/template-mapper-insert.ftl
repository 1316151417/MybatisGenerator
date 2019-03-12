    <insert id="insert" parameterType="${table.modelTypeNamespace}">
        insert into ${table.name}
        <trim prefix="(" suffix=")" suffixOverrides=",">
            <#list table.columnList as column>
            <if test="${column.propertyName} != null">
                ${column.name},
            </if>
            </#list>
        </trim>
        <trim prefix="values (" suffix=")" suffixOverrides=",">
            <#list table.columnList as column>
            <if test="${column.propertyName} != null">
                ${"#"}{${column.propertyName},jdbcType=${column.jdbcType}},
            </if>
            </#list>
        </trim>
    </insert>
