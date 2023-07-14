package chapter27.client.web;

import chapter27.domain.userinfo.UserInfo;
import chapter27.domain.userinfo.dao.UserInfoDao;
import chapter27.domain.userinfo.dao.mysql.UserInfoDaoMysql;
import chapter27.domain.userinfo.dao.oracle.UserInfoDaoOracle;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("DB_Properties");
        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DB_TYPE");
        System.out.println(dbType);

        UserInfo userInfo = new UserInfo("354325481949", "v3knqkqv32g", "seungo");
        UserInfoDao userInfoDao = null;

        if (dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoDaoOracle();

        } else if (dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoDaoMysql();
        } else {
            System.out.println("Not Support");
        }

        if (userInfo != null) {
            userInfoDao.insertUserInfo(userInfo);
            userInfoDao.updateUserInfo(userInfo);
            userInfoDao.deleteUserInfo(userInfo);
        }
    }
}
