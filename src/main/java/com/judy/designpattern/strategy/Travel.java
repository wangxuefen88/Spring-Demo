package com.judy.designpattern.strategy;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 12:43 2019/6/8
 */
public class Travel {
    private String tool;
    private int distance;

    public Travel(String tool, int distance) {
        this.tool = tool;
        this.distance = distance;
    }

    public ToolStatus travelTool(ToolMent toolMent) {
        return toolMent.tool(this.tool, this.distance);
    }
}
