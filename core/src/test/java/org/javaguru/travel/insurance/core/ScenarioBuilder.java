package org.javaguru.travel.insurance.core;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class ScenarioBuilder {
    public static Stream<Arguments> all(Arguments... args) {
        return Stream.of(args);
    }

    public static Arguments caseOf(String desc, Object input, Object expected) {
        return Arguments.of(desc, input, expected);
    }
}
