package com.yidu.ssmdemo007.service;

import com.yidu.ssmdemo007.bean.MenuInfo;
import com.yidu.ssmdemo007.dao.MenuInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuInfoService {

    @Autowired
    MenuInfoDao menuInfoDao;


    public  MenuInfo select(String menuid){
        MenuInfo menuInfo=menuInfoDao.select(menuid);

        return menuInfo;
    }


    public  int inset(MenuInfo menuInfo){

        return menuInfoDao.inst(menuInfo);
    }

}
