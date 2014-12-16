package msz.view;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class WelcomeViewTest {

    @Test
    public void shouldCreateView() {
        WelcomeView welcomeView = WelcomeView.create("example message");
        assertThat(welcomeView.getMessage(), is(equalTo("example message")));
    }
}
