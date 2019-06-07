package com.judy.designpattern.staticproxy;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 16:40 2019/6/5
 */
public class Father {
    //目标对象的引用
    private Son son;

    public Father(Son son) {
        this.son = son;
    }

    public void findLove(){
        System.out.println("根据你的要求物色");
        son.sonFindLove();
    }
}
