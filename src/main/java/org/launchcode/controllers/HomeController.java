package org.launchcode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

/**
 * Created by LaunchCode
 */
@Controller
public class HomeController extends TechJobsController {

    //Hashmap removed to be used with TechJobsController
    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("actions", actionChoices);
        return "index";
    }

}
