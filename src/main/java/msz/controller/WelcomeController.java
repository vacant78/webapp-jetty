package msz.controller;

import msz.view.WelcomeView;
import msz.view.WelcomeViewFactoryImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by ce-maciej.szantanski on 12/12/2014.
 */
@Controller
public class WelcomeController {
    private static final Logger logger= LogManager.getLogger();
    @Inject
    private WelcomeViewFactoryImpl welcomeViewFactory;

    @RequestMapping("/welcome")
    public String showWelcome(HttpServletRequest request,Model model) {
        WelcomeView welcomeView = welcomeViewFactory.create();
        model.addAttribute("welcomeView", welcomeView);
        logger.info(welcomeView);
        logger.info(welcomeView.getMessage());
        return "welcome";
    }

}
