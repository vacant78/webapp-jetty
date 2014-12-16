package msz.view;

import com.google.auto.value.AutoValue;

/**
 * Created by ce-maciej.szantanski on 15/12/2014.
 */

@AutoValue
public abstract class WelcomeView {
    static WelcomeView create(String message) {
        return new AutoValue_WelcomeView(message,false);
    }

    public abstract String getMessage();
    public abstract boolean isMessage();
}
