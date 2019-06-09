package com.judy.designpattern.changestrategy;

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

    public ToolStatus travelTool(NewChooseTool newChooseTool) {
        return  newChooseTool.getToolMent().tool(this.tool, this.distance);
    }
}
