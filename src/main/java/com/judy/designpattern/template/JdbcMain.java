package com.judy.designpattern.template;

import java.sql.SQLException;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 19:30 2019/6/8
 */
public class JdbcMain {
    public static void main(String[] args) throws SQLException {
        MemberDao memberDao = new MemberDao();
        memberDao.query();
    }
}
