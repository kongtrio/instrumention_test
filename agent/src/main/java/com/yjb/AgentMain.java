package com.yjb;

import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;

/**
 * @author yangjb
 * @since 2019-03-09 14:47
 * <p>
 * 未注释
 */
public class AgentMain {

    public static void agentmain(String agentArgs, Instrumentation inst) throws ClassNotFoundException,
            UnmodifiableClassException, InterruptedException {
        inst.addTransformer(new MyTransform(), true);
        //由于是在运行中才加入了Transform，因此需要重新retransformClasses一下
        Class<?> aClass = Class.forName("com.yjb.Test");
        inst.retransformClasses(aClass);
        System.out.println("Agent Main Done");
    }
}
