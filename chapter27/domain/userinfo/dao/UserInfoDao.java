package chapter27.domain.userinfo.dao;

import chapter27.domain.userinfo.UserInfo;

public interface UserInfoDao {
    void insertUserInfo(UserInfo userInfo);

    void updateUserInfo(UserInfo userInfo);

    void deleteUserInfo(UserInfo userInfo);

}
