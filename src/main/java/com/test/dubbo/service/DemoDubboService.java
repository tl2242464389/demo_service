package com.test.dubbo.service;

import com.test.pojo.Menu;

import java.util.List;

/**
 * @Description:
 * @Author: tl
 * @Date: 2019-06-28 10:58
 * @Version: 1.0
 */
public interface DemoDubboService {
    List<Menu> selAllMenu();

    Menu selMenuById(int id);

    int updMenu(Menu menu);
}
