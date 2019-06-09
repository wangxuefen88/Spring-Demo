package com.judy.designpattern.template;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 19:17 2019/6/8
 */
public class MemberDao{

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(null);


    public List<?> query() throws SQLException {
        String sql = "select * from t_member";
        return jdbcTemplate.executeQuery(sql, new RowMapper<Member>() {
            public Member mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                Member member = new Member();
                member.setUsername(resultSet.getString("username "));
                member.setPassword(resultSet.getString("passport"));
                member.setAddr(resultSet.getString("age"));
                member.setAge(resultSet.getInt("age"));
                return member;
            }
        },null);
    }

//    public Object processResult(ResultSet resultSet,int rowNum) throws SQLException {
//        Member member = new Member();
//        member.setUsername(resultSet.getString("username "));
//        member.setPassword(resultSet.getString("passport"));
//        member.setAddr(resultSet.getString("age"));
//        member.setAge(resultSet.getInt("age"));
//        return member;
//    }
}
