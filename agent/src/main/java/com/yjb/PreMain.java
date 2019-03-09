package com.yjb;

import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;

/**
 * @author yangjb
 * @since 2019-03-09 12:26
 * <p>
 * 未注释
 */
public class PreMain {

    public static void premain(String agentArgs, final Instrumentation inst) throws ClassNotFoundException,
            UnmodifiableClassException {
        inst.addTransformer(new MyTransform());
    }
}
