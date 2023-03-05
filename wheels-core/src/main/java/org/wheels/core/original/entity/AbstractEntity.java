package org.wheels.core.original.entity;


import java.time.LocalDateTime;

/**
 * 基础实体类
 */
public abstract class AbstractEntity {
    /**
     * 主键id
     */
    private Long id;
    /**
     * 创建人id
     */
    private Long createId;
    /**
     * 创建人
     */
    private String createName;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    /**
     * 修改人id
     */
    private Long updateId;
    /**
     * 修改人
     */
    private String updateName;
    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}

