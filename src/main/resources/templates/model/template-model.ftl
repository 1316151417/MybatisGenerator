<#-- Package -->
<#include "template-model-package.ftl">
<#-- Import -->
<#include "template-model-import.ftl">
public class ${table.modelTypeName} {
    <#-- Field -->
    <#include "template-model-field.ftl">
    <#-- GET SET -->
    <#include "template-model-getSet.ftl">
}
