package com.lxyw.base;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

@Transactional
@Component
public class BaseDaoImplement<T> implements BaseDao<T>{

    //绑定实体类对象
    protected Class<T> entityClass = getEntityClass();
    private SqlSession sqlSession;


    /**
     *  获取反射实体对象类Class
     * @return 实体对象类Class
     */
    public Class<T> getEntityClass(){
        Type parentType =getClass().getGenericSuperclass();
        if(parentType instanceof ParameterizedType){
            ParameterizedType type=(ParameterizedType)parentType;
            return (Class<T>)type.getActualTypeArguments()[0];
        }
        return null;
    }

    /**
     *  获取反射绑定实体类的类名
     * @return 类名
     */
    public String getEntityName(){
        String entityName=this.entityClass.getSimpleName();
        return entityName;
    }

    /**
     * 根据参数查询数据
     *
     * @param params
     */
    @Override
    public List findObject(Map params) throws Exception {

        return null;
    }

    /**
     * 新增保存对象方法
     *
     * @param o
     */
    @Override
    public int insertObject(Object o) throws Exception {
        return 0;
    }

    /**
     * 批量新增保存对象方法
     *
     * @param os
     */
    @Override
    public int batchInsertObject(List os) throws Exception {
        return 0;
    }

    /**
     * 更新保存对象方法
     *
     * @param o
     */
    @Override
    public int updateObject(Object o) throws Exception {
        return 0;
    }

    /**
     * 根据主键删除对象方法
     *
     * @param id
     */
    @Override
    public int deleteObject(String id) throws Exception {
        return 0;
    }

    /**
     * 批量删除方法
     *
     * @param ids
     */
    @Override
    public int batchDeleteObject(List ids) throws Exception {
        return 0;
    }
}
