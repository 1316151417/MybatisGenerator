<#-- ########## Header ########## -->
<#include "template-mapper-header.ftl">
<mapper namespace="${table.mapperTypeNamespace}">
    <#-- ########## Result Map ########## -->
    <#include "template-mapper-resultMap.ftl">
    <#-- ########## Column List ########## -->
    <#include "template-mapper-columnList.ftl">
    <#-- ########## Insert ########## -->
    <#include "template-mapper-insert.ftl">
    <#-- ########## Delete ########## -->
    <#include "template-mapper-deleteById.ftl">
    <#-- ########## Update ########## -->
    <#include "template-mapper-updateById.ftl">
    <#-- ########## Select ########## -->
    <#include "template-mapper-selectById.ftl">
    <#include "template-mapper-selectByCondition.ftl">
    <#-- ########## Count ########## -->
    <#include "template-mapper-countByCondition.ftl">
</mapper>
