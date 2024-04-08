package dev.erdil;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FibonacciNumbersDynamicProgramming {

    private final Solution s = new Solution();

    @Test
    public void shouldFib0is0() {
        assertThat(s.fibonacci(0), equalTo(0));
    }

    @Test
    public void shouldFib1is1() {
        assertThat(s.fibonacci(1), equalTo(1));
    }

    @Test
    public void shouldFib2is1() {
        assertThat(s.fibonacci(2), equalTo(1));
    }

    @Test
    public void shouldFib3is2() {
        assertThat(s.fibonacci(3), equalTo(2));
    }

    @Test
    public void shouldFib10is55() {
        assertThat(s.fibonacci(10), equalTo(55));
    }

    @Test
    public void shouldFib30is832040() {
        assertThat(s.fibonacci(30), equalTo(832040));
    }

    public class Solution {
        public int fibonacci(int n) {
            int[] subResults = new int[n + 1];
            return f(subResults, n);
        }

        public int f(int[] subResults, int n) {
            if (n == 0) {
                return 0;
            }
            if (n == 1) {
                return 1;
            }
            if (subResults[n] != 0) {
                return subResults[n];
            }

            subResults[n] = f(subResults, n-2) + f(subResults, n-1);

            return subResults[n];
        }
    }
}
