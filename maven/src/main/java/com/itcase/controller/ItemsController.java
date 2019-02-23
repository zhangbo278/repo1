package com.itcase.controller;

import com.itcase.domain.Items;
import com.itcase.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.LinkedList;
import java.util.List;

/**
 * @author ZhangBo
 * @version 1.0
 * @ClassName ItemsController
 * @Description TODO
 * @date 2019/2/22 22:13
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/find")
    public String findById(Model model){
        Items items = itemsService.findById(1);
        model.addAttribute("item",items);
        return "itemDetail";
    }
}
