package org.appfuse.tutorial.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by Administrator on 2016/2/25.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/home")
    public ModelAndView test(){
        System.out.println("hello test");
        ModelAndView model = new ModelAndView();
        model.setViewName("home");
        return model;
    }

    //Spring Security see this :
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(
            @RequestParam(value = "error", required = false) String error,
            @RequestParam(value = "logout", required = false) String logout) {

        System.out.println("login =====================================================");
        ModelAndView model = new ModelAndView();
        if (error != null) {
            model.addObject("error", "Invalid username and password!");
        }

        if (logout != null) {
            model.addObject("msg", "You've been logged out successfully.");
        }
        View view=new View() {
            @Override
            public String getContentType() {
                return null;
            }

            @Override
            public void render(Map<String, ?> map, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

            }
        };
        model.setViewName("login");

        return model;

    }


}
