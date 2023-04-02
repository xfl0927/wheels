package org.wheels.generator.domain.model.businessdomain;

import org.wheels.generator.domain.model.datamodel.Table;

import java.util.List;

/**
 * 业务领域
 */
public class BusinessDomain {
    /**
     * 业务名称
     */
    private String name;
    /**
     * 业务编码
     */
    private String code;
    /**
     * 业务相关表
     */
    private List<Table> tables;
}
