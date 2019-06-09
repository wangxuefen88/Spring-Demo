package com.judy.designpattern.jdkproxy.copy;

import java.awt.font.LineBreakMeasurer;
import java.lang.reflect.Method;

/**
 * @Author: judy
 * @Description:
 * @Date: Created in 9:11 2019/6/8
 */
public class JudyProxy {
    public static final String ln = "\r\n";

    public static Object newProxyInstance(JudyClassLoader classLoader, Class<?> interfaces, JudyInvocationHandler invocationHandler) {
        //1 动态生成源代码.java文件
        //2java文件输出磁盘
        //3把生成的.java文件编译成.class文件
        //4把.class文件加载jvm中运行
        //5返回字节码重组以后的新代理对象
        return null;
    }

    public static String generateStc(Class<?>[] interfaces) {
        StringBuffer sb = new StringBuffer();
        sb.append("package com.judy.designpattern.jdkproxy.copy" + ln);
        sb.append("public class $Proxy0 implements" + interfaces[0].getName() + "{" + ln);
              sb.append("JudyInvocationHandler h;" + ln);
              sb.append("public $Proxy0(JudyInvocationHandler h){" + ln);
                 sb.append("this.h=h;");
              sb.append("}" +ln);
           for (Method method1 : interfaces[0].getMethods()) {
               sb.append("public " + method1.getReturnType().getName() + " " + method1.getName() + "(){" + ln);
               sb.append("try{" + ln);
                  sb.append("Method m= " + interfaces[0].getName() + ".class.getMethod(\"" + method1.getName()+"\",new Class[]{});"+ln);
                  sb.append("this.h.invok(this,m,null);" + ln);
               sb.append("}catch(Exception e){" + ln);
               sb.append("e.printStackTrace()" + ln);
               sb.append("}");
           }


        sb.append("}"+ln);
        return null;
    }
}
