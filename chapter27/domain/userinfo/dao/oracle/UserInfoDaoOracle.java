package chapter27.domain.userinfo.dao.oracle;

import chapter27.domain.userinfo.UserInfo;
import chapter27.domain.userinfo.dao.UserInfoDao;

public class UserInfoDaoOracle implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into ORACLE DB where userId = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into ORACLE DB where userId = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete from ORACLE DB where userId = " + userInfo.getUserId());
    }
}
