package com.judy.designpattern.changestrategy;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 13:46 2019/6/8
 */
public class ToolStatus {
    private int distance;
    private String msg;

    public ToolStatus( int distance, String msg) {

        this.distance = distance;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ToolStatus{" +
                ", distance=" + distance +
                ", msg='" + msg + '\'' +
                '}';
    }
}
