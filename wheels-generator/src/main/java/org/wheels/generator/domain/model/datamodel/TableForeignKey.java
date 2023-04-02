package org.wheels.generator.domain.model.datamodel;

/**
 * 表外键
 */
public class TableForeignKey {
    /**
     * 外键所在表-子表
     */
    protected String tableName;
    /**
     * 外键字段名称
     */
    protected String columnName;
    /**
     * 被引用的表（父）
     */
    protected String referencedTableName;
    /**
     * 被引用的字段-默认为ID
     */
    protected String referencedTableColumnName;

}
