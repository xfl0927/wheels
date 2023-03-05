package org.wheels.core.original.payload;


import org.wheels.core.original.IRequestPayload;

/**
 * 基础请求体，用于post/put等请求
 */
public abstract class AbstractReqBody implements IRequestPayload {
    /**
     * 主键id
     */
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

