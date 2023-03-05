package org.wheels.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class Main {
    private static final String url = "jdbc:mysql://localhost:3306/db_porter?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=GMT%2B8";
    public static void main(String[] args) {
        FastAutoGenerator.create(url, "root", "flzx3qc&")
                .globalConfig(builder -> {
                    builder.author("baomidou") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("/Users/huangwenlong/Coder/genedcode"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("org.porter.samples.generator") // 设置父包名
                            .moduleName("system") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "/Users/huangwenlong/Coder/genedcode")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("gen_table") // 设置需要生成的表名
                            .addTablePrefix("gen_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}