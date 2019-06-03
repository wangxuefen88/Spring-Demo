package com.judy.DesignPattern.singleton.register;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 13:47 2019/6/2
 */
public class RegisterMap {
    private static Map<String, Object> register = new HashMap();
    public static RegisterMap getInstance(String name){
        if (name == null) {
            name = RegisterMap.class.getName();
        }
        if (register.get(name)==null){
            try {
                register.put(name,new RegisterMap());
            } catch (Exception e) {
            }
        }
        return (RegisterMap)register.get(name);
    }
}
