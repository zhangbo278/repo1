package com.itcase.dao;

import com.itcase.domain.Items;

/**
 * @author ZhangBo
 * @version 1.0
 * @ClassName ItemsDao
 * @Description TODO
 * @date 2019/2/22 20:38
 */
public interface ItemsDao {
    /**
     * 通过id查items
     * @param id
     * @return
     */
    public Items findById(Integer id);
}
