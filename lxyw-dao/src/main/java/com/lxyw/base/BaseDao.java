package com.lxyw.base;

import java.util.List;
import java.util.Map;

/**
 * 基础DAO接口，提供单表操作支持
 * @param <T>
 */
public interface BaseDao<T>{

    /**
     * 根据参数查询数据
     */
    public List<T> findObject(Map<String,Object> params) throws Exception;

    /**
     *  新增保存对象方法
     */
    public int insertObject(T o) throws Exception;

    /**
     *  批量新增保存对象方法
     */
    public int batchInsertObject(List<T> os) throws Exception;

    /**
     *  更新保存对象方法
     */
    public int updateObject(T o) throws Exception;

    /**
     *  根据主键删除对象方法
     */
    public int deleteObject(String id) throws Exception;

    /**
     *  批量删除方法
     */
    public int batchDeleteObject(List<String> ids) throws Exception;

}
