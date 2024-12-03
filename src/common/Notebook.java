package common;

import common.interfaces.Thing;

/**
 * Блокнот
 */
public class Notebook implements Thing {
    @Override
    public String getName() {
        return "Блокнот";
    }
}
