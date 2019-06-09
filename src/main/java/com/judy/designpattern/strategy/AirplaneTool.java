package com.judy.designpattern.strategy;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 13:49 2019/6/8
 */
public class AirplaneTool implements ToolMent {
    public ToolStatus tool(String s, int distance) {
        return new ToolStatus(distance, s);
    }
}
