package com.judy.DesignPattern.factory;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 15:43 2019/5/25
 */
public class AppleFactory {

  public void createInstance(String name){
      if (name.equals("apple1")){
          new Apple1().AppleMethod();
      }
      if (name.equals("apple2")){
          new Apple2().AppleMethod();
      }
      if (name.equals("apple3")){
          new Apple3().AppleMethod();
      }
  }
}
