package com.chanxi.dao.user;


import com.chanxi.dao.BaseDao;
import com.chanxi.model.user.User;
import com.chanxi.model.user.UserArgs;

/**
 * Created by ymind on 2018/6/4.
 */
public interface UserDao extends BaseDao{
    User search (UserArgs args);
}
