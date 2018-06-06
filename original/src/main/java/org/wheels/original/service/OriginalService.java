package org.wheels.original.service;import org.springframework.beans.factory.annotation.Autowired;import org.wheels.original.entity.Original;import org.wheels.original.interfaces.OriginalDao;import java.util.List;/** * @program: wheels * @description: CRUD Base Operation * @author: xfl * @create: 2018-06-06 13:50 **/public abstract class OriginalService<D extends OriginalDao<T> ,T extends Original<T>> {    @Autowired    D d;    /**     * insert     * @param entity     */    public void insert(T entity){ d.insert(entity); }    /**     * update by primary key     * @param entity     */    public void update(T entity){ d.update(entity);}    /**     * delete by primary key     * @param id     */    public void delete(Long id){ d.delete(id);}    /**     * find information by primary key     * @param id     * @return     */    public T find(Long id){return d.find(id);}    /**     * find information list by other condition     * @param entity     * @return     */    public List<T> findList(T entity){ return d.findList(entity);}}