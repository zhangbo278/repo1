package com.itcase.service;

import com.itcase.domain.Items;

/**
 * @author ZhangBo
 * @version 1.0
 * @ClassName ItemsService
 * @Description TODO
 * @date 2019/2/22 21:43
 */
public interface ItemsService {
    /**
     * 查询items
     * @param id
     * @return
     */
    public Items findById(Integer id);
}
