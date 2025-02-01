package com.modular.two;

import com.modular.one.OneImpl;

/**
 *
 * @author Larbi
 */
public class Two {

    public static void execute() {
        System.out.println(new TwoImpl().sayHello(new OneImpl()));
    }
}
