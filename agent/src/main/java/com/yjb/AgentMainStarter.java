package com.yjb;

import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AgentLoadException;
import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;

import java.io.IOException;

/**
 * @author yangjb
 * @since 2019-03-09 14:49
 * <p>
 * 未注释
 */
public class AgentMainStarter {

    public static void main(String[] args) throws IOException, AttachNotSupportedException, AgentLoadException,
            AgentInitializationException {
        //运行需要修改这个进程id
        VirtualMachine attach = VirtualMachine.attach("68796");
        attach.loadAgent("/Users/yangjb/meitu/instrumention_test/agent/target/agent-jar-with-dependencies.jar");
        attach.detach();
        System.out.println("over");
    }
}
