package com.tal.zj;

import com.tal.zj.constants.ColumnType;
import com.tal.zj.model.Column;
import com.tal.zj.model.Table;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreeMarkerTest {
    private Configuration configuration;
    private Template template;
    Map<String, Object> dataModel;
    @Before
    public void before() throws Exception {
        //创建配置实例
        configuration = new Configuration(Configuration.VERSION_2_3_28);
        //设置模板文件加载路径
        String templatePathName = new StringBuilder(System.getProperty("user.dir")).append("/src/main/resources/templates").toString();
        File templateDir = new File(templatePathName);
        configuration.setDirectoryForTemplateLoading(templateDir);
        //设置模板异常处理器
        configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        //设置默认编码
        configuration.setDefaultEncoding("UTF-8");

        //创建Mapper数据模型
        List<Column> columnList = new ArrayList<>();
        columnList.add(new Column("id", ColumnType.STRING, true));
        columnList.add(new Column("age", ColumnType.INTEGER, false));
        columnList.add(new Column("birthday", ColumnType.DATE, false));
        Table table = new Table("tb_user");
        table.setColumnList(columnList);
        table.setBasePackage("com.tal.zj");
        dataModel = new HashMap<>();
        dataModel.put("table", table);
    }

    @Test
    public void testHello() throws Exception {
        //创建数据模型
        Map<String, Object> dataModel = new HashMap<>();
        dataModel.put("name", "Zhou Jie");

        //获取模板
        template = configuration.getTemplate("template-hello.ftl");

        //输出
        Writer out = new OutputStreamWriter(System.out);
        template.process(dataModel, out);
    }

    @Test
    public void testModel() throws Exception {
        //获取模板
        template = configuration.getTemplate("model/template-model.ftl");

        //输出
        Writer out = new OutputStreamWriter(System.out);
        template.process(dataModel, out);
    }

    @Test
    public void testDao() throws Exception {
        //获取模板
        template = configuration.getTemplate("dao/template-dao.ftl");

        //输出
        Writer out = new OutputStreamWriter(System.out);
        template.process(dataModel, out);
    }

    @Test
    public void testMapper() throws Exception {
        //获取模板
        template = configuration.getTemplate("mapper/template-mapper.ftl");

        //输出
        Writer out = new OutputStreamWriter(System.out);
        template.process(dataModel, out);
    }
}
