package com.judy.designpattern.template;


import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 15:09 2019/6/8
 */
public class JdbcTemplate {
    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    private Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }

    private PreparedStatement createPreparedStatement(Connection connection, String sql) throws SQLException {
        return connection.prepareStatement(sql);
    }


    private ResultSet executeQuery(PreparedStatement pstmt, Object[] values) throws SQLException {
        for (int i = 0; i < values.length; i++) {
            pstmt.setObject(i,values[i]);
        }
        return pstmt.executeQuery();
    }

    /**
     * 关闭语句集
     * @param stmt
     */
    private void closeStatement(Statement stmt) throws SQLException {
        stmt.close();
    }

    /**
     * 关闭结果集
     * @param resultSet
     */
    private void closeresult(ResultSet resultSet) throws SQLException {
        resultSet.close();
    }

    /**
     * 关闭连接
     * @param connection
     */
    private void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }



    private List<?> parseResultSet(ResultSet resultSet, RowMapper rowMapper) throws SQLException {
        int rowNum = 1;

        List<Object> result = new ArrayList<Object>();
        while (resultSet.next()) {
            result.add(rowMapper.mapRow(resultSet, rowNum + 1));
        }
        return result;
    }



    public List<?> executeQuery(String sql, RowMapper<?> rowMapper, Object[] values) throws SQLException {
        /**
         * 1获取连接
         * 2创建语句集
         * 3执行语句集,并且获得语句集
         * 4解析语句集
         * 5关闭结果集
         * 6关闭语句集
         * 7关闭连接
         */
        //1.获取连接
        Connection connection = this.getConnection();
        //2.创建语句集
        PreparedStatement preparedStatement = this.createPreparedStatement(connection, sql);
        //3.执行语句集并且获得语句集
        ResultSet resultSet = executeQuery(preparedStatement,values);
         //4 解析语句集
        List<?> result = this.parseResultSet(resultSet, rowMapper);
         //5结果集关闭
        this.closeresult(resultSet);
        //6语句集关闭
        this.closeStatement(preparedStatement);
        //7连接关闭
        this.closeConnection(connection);
        return result;
    }


//    public abstract Object processResult(ResultSet resultSet, int rowNum) throws SQLException;


}
