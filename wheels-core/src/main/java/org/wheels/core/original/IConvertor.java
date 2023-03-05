package org.wheels.core.original;


import org.wheels.core.original.entity.AbstractEntity;
import org.wheels.core.original.payload.AbstractReqBody;

import java.util.List;
import java.util.stream.Collectors;

/**
 * description:
 *
 * @author huangwl
 * @since 2023-03-04 17:07
 */
public interface IConvertor<E extends AbstractEntity, RB extends AbstractReqBody, RPD, RPL> {
    RPD convert2Detail(E entity);

    RPL convert2List(E entity);

    E convert2Entity(RB requestBody);

    default List<RPL> convert2List(List<E> entities) {
        return entities.stream().map(this::convert2List).collect(Collectors.toList());
    }
}
