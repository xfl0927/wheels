package org.wheels.original.interfaces;import java.util.List;public interface OriginalDao<T> {    /**     * insert     * if primary key is auto-increment , return primary key value     * @param entity     */    void insert(T entity);    /**     * delete by primary key     * @param id     */    void delete(Long id);    /**     * update     * @param entity     */    void update(T entity);    /**     * find information     * @param id     * @return     */    T find(Long id);    /**     * find information list     * @param entity     * @return     */    List<T> findList(T entity);}