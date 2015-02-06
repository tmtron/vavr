/**    / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javaslang;

/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*\
   G E N E R A T O R   C R A F T E D
\*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*/

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Objects;
import org.junit.Test;

public class Tuple11Test {

    @Test
    public void shouldCreateTuple() {
        final Tuple11<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> tuple = createTuple();
        assertThat(tuple).isNotNull();
    }

    @Test
    public void shouldGetArity() {
        final Tuple11<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> tuple = createTuple();
        assertThat(tuple.arity()).isEqualTo(11);
    }

    @Test
    public void shouldFlatMap() {
        final Tuple11<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> tuple = createTuple();
        final Function11<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Tuple11<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object>> mapper = (o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11) -> tuple;
        final Tuple11<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> actual = tuple.flatMap(mapper);
        assertThat(actual).isEqualTo(tuple);
    }

    @Test
    public void shouldMap() {
        final Tuple11<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> tuple = createTuple();
        final Function11<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Tuple11<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>> mapper = (o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11) -> tuple;
        final Tuple11<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> actual = tuple.map(mapper);
        assertThat(actual).isEqualTo(tuple);
    }

    @Test
    public void shouldUnapply() {
        final Tuple11<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> tuple = createTuple();
        assertThat(tuple.unapply()).isEqualTo(tuple);
    }

    @Test
    public void shouldCompareViaEquals() {
        final Tuple11<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> tuple1 = createTuple();
        final Tuple11<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> tuple2 = createTuple();
        assertThat(tuple1).isEqualTo(tuple2);
    }

    @Test
    public void shouldComputeCorrectHashCode() {
        final int actual = createTuple().hashCode();
        final int expected = Objects.hash(null, null, null, null, null, null, null, null, null, null, null);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldImplementToString() {
        final String actual = createTuple().toString();
        final String expected = "(null, null, null, null, null, null, null, null, null, null, null)";
        assertThat(actual).isEqualTo(expected);
    }

    private Tuple11<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> createTuple() {
        return new Tuple11<>(null, null, null, null, null, null, null, null, null, null, null);
    }
}