package ru.ncheranev.interview.mapper;

import java.util.function.Function;

public interface Mapper<INPUT, OUTPUT> extends Function<INPUT, OUTPUT> {
    OUTPUT map(INPUT input);
    default OUTPUT apply(INPUT input) {
        return map(input);
    }
}