package com.judy.designpattern.template;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 19:58 2019/6/8
 */
public interface RowMapper<T> {
    public T mapRow(ResultSet resultSet, int rowNum) throws SQLException;
}
