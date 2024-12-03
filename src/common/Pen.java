package common;

import common.interfaces.Thing;

/**
 * Ручка
 */
public class Pen implements Thing {
    @Override
    public String getName() {
        return "Ручка";
    }
}
