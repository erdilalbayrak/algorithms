package dev.erdil;

import org.junit.jupiter.api.Test;

import static dev.erdil.FibonacciNumbersDynamicProgramming.Solution.fibonacci;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FibonacciNumbersDynamicProgramming {

    @Test
    public void shouldFib0is0() {
        assertThat(fibonacci(0), equalTo(0));
    }

    @Test
    public void shouldFib1is1() {
        assertThat(fibonacci(1), equalTo(1));
    }

    @Test
    public void shouldFib2is1() {
        assertThat(fibonacci(2), equalTo(1));
    }

    @Test
    public void shouldFib3is2() {
        assertThat(fibonacci(3), equalTo(2));
    }

    @Test
    public void shouldFib10is55() {
        assertThat(fibonacci(10), equalTo(55));
    }

    public class Solution {
        public static int fibonacci(int n) {
            return 0;
        }
    }
}
