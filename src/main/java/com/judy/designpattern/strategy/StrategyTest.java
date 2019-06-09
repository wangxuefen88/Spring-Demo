package com.judy.designpattern.strategy;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 12:41 2019/6/8
 */
public class StrategyTest {
    public static void main(String[] args){
        Travel travel = new Travel("自行车", 500);
        ToolMent ziXingTool = new ZiXingTool();
        ToolStatus toolStatus = travel.travelTool(ziXingTool);
        System.out.println(toolStatus.toString());
    }
}
