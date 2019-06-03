package com.judy.DesignPattern.singleton.lazy;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 11:00 2019/6/1
 */
public class  LazyThree {
    public LazyThree() {

    }
 public static final LazyThree getInstance(){
     return LayHolder.lazy;
}

  private static class LayHolder{
      private static final LazyThree lazy = new LazyThree();
    }
}

