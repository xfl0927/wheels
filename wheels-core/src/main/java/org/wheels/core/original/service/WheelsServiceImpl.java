package org.wheels.core.original.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.ReflectionKit;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.wheels.core.original.IConvertor;
import org.wheels.core.original.IResponseDetail;
import org.wheels.core.original.IResponseList;
import org.wheels.core.original.entity.AbstractEntity;
import org.wheels.core.original.payload.AbstractReqBody;

/**
 * description:
 *
 * @author huangwl
 * @since 2023-03-04 15:42
 */
public class WheelsServiceImpl<RQB extends AbstractReqBody, E extends AbstractEntity,
        RPD extends IResponseDetail, RPL extends IResponseList,
        C extends IConvertor<E, RQB, RPD, RPL>, M extends BaseMapper<E>>
        extends ServiceImpl<M, E>
        implements IWheelsService<RQB, E, RPD, RPL, C>
{

    protected Class<E> entityClass = this.currentEntityClass();
    protected Class<RQB> rbClass = this.currentRequestBodyClass();

    protected Class<E> currentEntityClass() {
        return (Class<E>) ReflectionKit.getSuperClassGenericType(this.getClass(), WheelsServiceImpl.class, 1);
    }

    protected Class<RQB> currentRequestBodyClass() {
        return (Class<RQB>) ReflectionKit.getSuperClassGenericType(this.getClass(), WheelsServiceImpl.class, 0);
    }



}
