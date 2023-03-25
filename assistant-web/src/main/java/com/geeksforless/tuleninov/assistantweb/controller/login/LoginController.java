package com.geeksforless.tuleninov.assistantweb.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

import static com.geeksforless.tuleninov.assistantlib.Routes.URL_LOGIN;
import static com.geeksforless.tuleninov.assistantweb.Constants.SCOPE_MESSAGE;

/**
 * Controller for the email page.
 *
 * @author Oleksandr Tuleninov
 * @version 01
 */
@Controller
@RequestMapping(value = URL_LOGIN)
public class LoginController {

    /**
     * Get email page.
     *
     * @return email page
     */
    @GetMapping()
    public String login(HttpServletRequest request) {
        request.getSession().removeAttribute(SCOPE_MESSAGE);

        return "index";
    }
}
