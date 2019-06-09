package com.judy.designpattern.changestrategy;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 12:41 2019/6/8
 */
public class StrategyTest {
    public static void main(String[] args){
        Travel travel = new Travel("飞机", 500);
        ToolStatus toolStatus = travel.travelTool(NewChooseTool.AIRPLANTOOL);
        System.out.println(toolStatus.toString());
    }
}
