package org.wheels.core.original.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.ReflectionKit;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.mapstruct.factory.Mappers;
import org.wheels.core.original.IConvertor;
import org.wheels.core.original.entity.AbstractEntity;
import org.wheels.core.original.payload.AbstractReqBody;

import java.util.List;
import java.util.Objects;

/**
 * description:
 *
 * @author huangwl
 * @since 2023-03-04 15:36
 */
public interface IWheelsService<RB extends AbstractReqBody, E extends AbstractEntity, RPD, RPL, C extends IConvertor<E, RB, RPD, RPL>> extends IService<E> {
    default Class<C> currentConvertClass() {
        return (Class<C>) ReflectionKit.getSuperClassGenericType(this.getClass(), WheelsServiceImpl.class, 4);
    }
    default C convertor(){
        return Mappers.getMapper(currentConvertClass());
    }

    /**
     * 插入一条记录（选择字段，策略插入）
     *
     * @param requestBody 请求对象
     */
    default boolean save(RB requestBody) {
        E e = convertor().convert2Entity(requestBody);
        return save(e);
    }

    /**
     * 根据 ID 选择修改
     *
     * @param requestBody 请求对象
     */
    default boolean updateById(RB requestBody) {
        E e = convertor().convert2Entity(requestBody);
        return updateById(e);
    }

    /**
     * 根据 whereEntity 条件，更新记录
     *
     * @param requestBody 请求对象
     * @param updateWrapper 实体对象封装操作类 {@link com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper}
     */
    default boolean update(RB requestBody, Wrapper<E> updateWrapper) {
        E e = convertor().convert2Entity(requestBody);
        return update(e, updateWrapper);
    }

    /**
     * 根据 Wrapper，查询一条记录 <br/>
     * <p>结果集，如果是多个会抛出异常，随机取一条加上限制条件 wrapper.last("LIMIT 1")</p>
     *
     * @param queryWrapper 实体对象封装操作类 {@link com.baomidou.mybatisplus.core.conditions.query.QueryWrapper}
     */
    default RPD getOneRPD(Wrapper<E> queryWrapper) {
        E one = getOne(queryWrapper);
        if (Objects.isNull(one)) {
            return null;
        }
        return convertor().convert2Detail(one);
    }

    /**
     * 查询列表
     *
     * @param queryWrapper 实体对象封装操作类 {@link com.baomidou.mybatisplus.core.conditions.query.QueryWrapper}
     */
    default List<RPL> listRPL(Wrapper<E> queryWrapper) {
        List<E> list = list(queryWrapper);
        return convertor().convert2List(list);
    }

    /**
     * 查询所有
     *
     * @see Wrappers#emptyWrapper()
     */
    default List<RPL> listRPL() {
        List<E> list = list(Wrappers.emptyWrapper());
        return convertor().convert2List(list);
    }

    /**
     * 翻页查询
     *
     * @param page         翻页对象
     * @param queryWrapper 实体对象封装操作类 {@link com.baomidou.mybatisplus.core.conditions.query.QueryWrapper}
     */
    default Page<RPL> pageRPL(IPage<E> page, Wrapper<E> queryWrapper) {
        IPage<E> pageInfo = page(page, queryWrapper);
        Page<RPL> pages = new Page<>();
        pages.setPages(pageInfo.getPages());
        pages.setTotal(pageInfo.getTotal());
        List<RPL> rpls = convertor().convert2List(pageInfo.getRecords());
        pages.setRecords(rpls);
        pages.setCurrent(page.getCurrent());
        pages.setSize(page.getSize());
        return pages;
    }


}
