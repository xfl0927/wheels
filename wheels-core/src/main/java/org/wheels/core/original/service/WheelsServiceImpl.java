package org.wheels.core.original.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.ReflectionKit;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.wheels.core.original.IConvertor;
import org.wheels.core.original.entity.AbstractEntity;
import org.wheels.core.original.payload.AbstractReqBody;

/**
 * description:
 *
 * @author huangwl
 * @since 2023-03-04 15:42
 */
public class WheelsServiceImpl<RB extends AbstractReqBody, E extends AbstractEntity, RPD, RPL, C extends IConvertor<E, RB, RPD, RPL>, M extends BaseMapper<E>> extends ServiceImpl<M, E> implements IWheelsService<RB, E, RPD, RPL, C> {

    protected Class<E> entityClass = this.currentEntityClass();
    protected Class<RB> rbClass = this.currentRequestBodyClass();

    protected Class<E> currentEntityClass() {
        return (Class<E>) ReflectionKit.getSuperClassGenericType(this.getClass(), WheelsServiceImpl.class, 1);
    }

    protected Class<RB> currentRequestBodyClass() {
        return (Class<RB>) ReflectionKit.getSuperClassGenericType(this.getClass(), WheelsServiceImpl.class, 0);
    }



}
