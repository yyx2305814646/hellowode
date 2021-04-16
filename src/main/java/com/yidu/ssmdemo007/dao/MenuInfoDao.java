package com.yidu.ssmdemo007.dao;

import com.yidu.ssmdemo007.bean.MenuInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MenuInfoDao {
    /**
     * 查询所有
     * @return
     */

    public MenuInfo select(String menuid);

    /**
     * 新增
     * @param menuInfo
     * @return
     */

    public  int inst(MenuInfo menuInfo);

    /**
     * 删除
     * @param menuid
     * @return
     */

    public  String dele(String menuid );


}
