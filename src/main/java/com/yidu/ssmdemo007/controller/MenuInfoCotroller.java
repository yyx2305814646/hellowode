package com.yidu.ssmdemo007.controller;

import com.yidu.ssmdemo007.bean.MenuInfo;
import com.yidu.ssmdemo007.service.MenuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MenuInfoCotroller {

    @Autowired
    MenuInfoService menuInfoService;

    @RequestMapping("select")
    @ResponseBody
    public MenuInfo select(String menuid) {
        return menuInfoService.select(menuid);
    }

    @RequestMapping("inst")
    @ResponseBody
    public int inst(MenuInfo menuInfo) {
        int menuInfo1 = menuInfoService.inset(menuInfo);


        return menuInfo1;

    }
}
