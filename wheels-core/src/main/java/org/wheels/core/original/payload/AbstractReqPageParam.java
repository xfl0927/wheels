package org.wheels.core.original.payload;


import org.wheels.core.original.IRequestPayload;

/**
 * 基础分页请求参数，用于get分页请求
 * 实现{@link IRequestPayload}接口，规范为请求的有效载荷
 */
public abstract class AbstractReqPageParam implements IRequestPayload {
    /**
     * 主键id
     */
    private Long id;
    /**
     * pageSize 页面大小
     */
    private Integer pageSize;
    /**
     * pageNum 页号
     */
    private Integer pageNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
}

