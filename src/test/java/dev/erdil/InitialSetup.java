package dev.erdil;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class InitialSetup {

    @Test
    public void shouldPass() {
        assertThat(true, equalTo(true));
    }
}
