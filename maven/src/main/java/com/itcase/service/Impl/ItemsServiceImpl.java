package com.itcase.service.Impl;

import com.itcase.dao.ItemsDao;
import com.itcase.domain.Items;
import com.itcase.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ZhangBo
 * @version 1.0
 * @ClassName ItemsServiceImpl
 * @Description TODO
 * @date 2019/2/22 21:43
 */
@Service
public class ItemsServiceImpl implements ItemsService{
    @Autowired
    private ItemsDao itemsDao;

    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
