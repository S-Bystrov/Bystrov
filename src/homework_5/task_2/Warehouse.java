package homework_5.task_2;

import java.util.Arrays;

public class Warehouse {
    static int iter = 0;
    private final Wire[] wire;

    public Warehouse(Wire[] wire) {
        this.wire = wire;
    }

    public Wire next() {

        if (iter >= wire.length) {
            iter = 0;
        }

        return wire[iter++];
    }

    public Wire[] getArray() {
        Wire[] copy = Arrays.copyOf(wire, wire.length);
        return copy;
    }

    @Override
    public String toString() {
        return "WareHouse{" +
                "wire=" + Arrays.toString(wire) +
                '}';
    }
}
