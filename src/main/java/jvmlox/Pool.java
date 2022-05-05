package jvmlox;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

class Pool {
  private final AtomicInteger idCounter = new AtomicInteger(0);
    private final Map<Constant, Integer> constants = new TreeMap<>();

    <T extends Constant> Index<T> create(T constant) {
        int index = constants.computeIfAbsent(constant, c -> idCounter.getAndIncrement());
        return new Index<>(index);
    }
}