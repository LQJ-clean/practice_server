package com.example.demo.core;


import com.example.demo.common.MyPage;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * 通用的增删改查操作
 */
public interface GeneralOperation<T> {

    /**
     * 添加
     * @param entity 实体
     * @return 对象
     */
    T add(T entity);

    /**
     * 删除
     * @param entity 实体
     * @return 状态
     */
    int delete(T entity);

    /**
     * 修改
     * @param entity 实体
     * @return 对象
     */
    T update(T entity);

    /**
     * 分页查询
     * @param page 分页数据
     * @return 对象
     */
    Page<T> query(MyPage<T> page);

    /**
     * 查询所有
     * @param entity 实体
     * @return 对象
     */
    List<T> queryAll(T entity);
}
