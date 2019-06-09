package com.judy.designpattern.changestrategy;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 14:26 2019/6/8
 */
public enum NewChooseTool {
    ZIXINGHCE (new ZiXingTool()),
    AIRPLANTOOL(new AirplaneTool());

    private ToolMent toolMent;
    NewChooseTool(ToolMent toolMent) {
        this.toolMent = toolMent;
    }

    public ToolMent getToolMent() {
        return this.toolMent;
    }
}
