<#-- Package -->
<#include "template-dao-package.ftl">
<#-- Import -->
<#include "template-dao-import.ftl">
public interface ${table.mapperTypeName} {
<#-- Method -->
<#include "template-dao-method.ftl">
}