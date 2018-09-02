package org.launchcode.deedaday.controllers;

import org.launchcode.deedaday.models.Data.DeedDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("")
public class DeedController {

    @Autowired
    public DeedDao deedDao;

    @RequestMapping(value = "deed")
    public String index(Model model) {

        model.addAttribute("title", "Today's Deed");
        //TODO: make deed come from db
//        model.addAttribute();

        return "index";

    }


}
