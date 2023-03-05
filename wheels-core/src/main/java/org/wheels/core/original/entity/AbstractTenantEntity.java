package org.wheels.core.original.entity;


public abstract class AbstractTenantEntity extends AbstractEntity {
    /**
     * 租户id
     */
    private Long tenantId;
    /**
     * 部门id
     */
    private Long deptId;

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }
}

