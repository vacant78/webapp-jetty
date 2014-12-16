package msz.view;

import org.springframework.stereotype.Component;

import javax.inject.Named;

/**
 * Created by ce-maciej.szantanski on 15/12/2014.
 */

@Component
public class WelcomeViewFactoryImpl {
    public WelcomeView create() {
        return WelcomeView.create("welcome to the app");
    }
}
