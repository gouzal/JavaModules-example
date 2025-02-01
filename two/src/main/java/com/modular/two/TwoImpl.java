package com.modular.two;

import com.modular.one.OneInterface;

/**
 *
 * @author Larbi
 */
public class TwoImpl implements TwoInterface {

    @Override
    public String sayHello(OneInterface one) {
        return one.sayHello() + " Hello from Module Two!";
    }

}
