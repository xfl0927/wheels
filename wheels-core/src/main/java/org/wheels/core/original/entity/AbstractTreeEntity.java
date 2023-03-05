package org.wheels.core.original.entity;

import java.util.List;

/**
 * 树实体
 */
public abstract class AbstractTreeEntity extends AbstractEntity {
    /**
     * 父节点ID
     */
    private Long parentId;
    /**
     * 父节点ids，逗号分割的字符串
     */
    private String parentIds;
    /**
     * 名称
     */
    private String name;
    /**
     * 子节点
     */
    private List<AbstractTreeEntity> children;

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AbstractTreeEntity> getChildren() {
        return children;
    }

    public void setChildren(List<AbstractTreeEntity> children) {
        this.children = children;
    }
}
