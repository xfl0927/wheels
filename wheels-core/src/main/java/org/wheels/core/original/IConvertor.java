package org.wheels.core.original;


import org.wheels.core.original.entity.AbstractEntity;
import org.wheels.core.original.payload.AbstractReqBody;

import java.util.List;

/**
 * 对象数据转换基础行为定义接口
 * @author huangwl
 * @since 2023-03-04 17:07
 */
public interface IConvertor<E extends AbstractEntity, RQB extends AbstractReqBody, RPD extends IResponseDetail, RPL extends IResponseList> {

    /**
     * 实体数据转换为响应详情
     * @param entity 实体数据
     * @return 响应详情
     */
    RPD entity2RespDetail(E entity);

    /**
     * 请求体转换为实体
     * @param requestBody 请求体
     * @return 实体
     */
    E reqBody2Entity(RQB requestBody);

    /**
     * 实体列表转为响应列表
     * @param entities  实体列表
     * @return 响应列表
     */
    List<RPL> entities2RespList(List<E> entities);
}
