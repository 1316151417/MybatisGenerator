    int insert(${table.modelTypeName} ${table.modelName});
    int deleteById(${table.primaryKey.typeName} primaryKey);
    int updateById(${table.modelTypeName} ${table.modelName});
    ${table.modelTypeName} selectById(${table.primaryKey.typeName} primaryKey);
    List<${table.modelTypeName}> selectByCondition(${table.modelTypeName} ${table.modelName});
    long countByCondition(${table.modelTypeName} ${table.modelName});
