package org.wheels.core.original.resp;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 树
 */
public abstract class AbstractTree {

    /** ID */
    private Long id;
    /** 父节点ID */
    private Long parentId;
    /** 名称 */
    private String name;
    /** 子节点 */
    private List<AbstractTree> children;

    /**
     * 组装子节点
     * @param root  节点
     * @param all   组装树所需的原始数据列表
     * @return 子节点
     */
    public List<AbstractTree> assembleChildren(AbstractTree root, List<AbstractTree> all) {
        return all.stream().filter(el -> root.getId().equals(el.getParentId()))
                .peek(child -> {
                    child.setChildren(assembleChildren(child, all));
                }).collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AbstractTree> getChildren() {
        return children;
    }

    public void setChildren(List<AbstractTree> children) {
        this.children = children;
    }
}
