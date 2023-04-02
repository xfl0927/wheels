package org.wheels.generator.domain.model.datamodel;

/**
 * 表字段信息
 */
public class TableColumn {
    /**
     * 是否主键
     */
    private Boolean primaryKey;
    /**
     * 名称
     */ private String name;
    /**
     * 字段类型
     */
    private String type;
    /**
     * 长度
     */
    private String length;
    /**
     * 小数点
     */
    private String radixPoint;

    /**
     * 是否非空
     */
    private Boolean notNull;
    /**
     * 字段注释,需要去除 换行符
     */
    private String comment;
}
