package chapter27.domain.userinfo.dao.mysql;

import chapter27.domain.userinfo.UserInfo;
import chapter27.domain.userinfo.dao.UserInfoDao;

public class UserInfoDaoMysql implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into MYSQL DB where userId = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into MYSQL DB where userId = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete from MYSQL DB where userId = " + userInfo.getUserId());
    }
}
