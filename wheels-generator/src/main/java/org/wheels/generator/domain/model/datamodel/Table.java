package org.wheels.generator.domain.model.datamodel;

import java.util.List;

/**
 * 表信息
 */
public class Table {
    /**
     * 表名
     */
    private String name;
    /**
     * 表注释
     */
    private String comment;

    /**
     * 字段字段
     */
    private List<TableColumn> columns;
    /**
     * 外键
     */
    private List<TableForeignKey> fks;
}
