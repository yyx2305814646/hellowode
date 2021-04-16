package com.yidu.ssmdemo007.dao;

import com.yidu.ssmdemo007.bean.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {
    /**
     * 登陆
     * @param username
     * @param userpass
     * @return 用户对象
     */

    public UserInfo logins(String username,String userpass);

    /**
     * 注册
     * @param userInfo
     * @return
     */

    public int insert(UserInfo userInfo);

    /**
     * 查询所有
     */
    public List<UserInfo> selectAll();
}
