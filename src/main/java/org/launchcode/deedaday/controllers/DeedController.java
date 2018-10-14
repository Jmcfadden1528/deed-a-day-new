package org.launchcode.deedaday.controllers;

import org.launchcode.deedaday.models.Data.DeedDao;
import org.launchcode.deedaday.models.Deed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@Controller
@RequestMapping("")
public class DeedController {

    @Autowired
    public DeedDao deedDao;

    @RequestMapping(value = "deed")
    public String index(Model model) {

        Deed todaysDeed = deedDao.findOne(1);
        model.addAttribute("title", "Today's Deed");
        //TODO: make deed come from db
        model.addAttribute("todaysDeed", todaysDeed);

        return "index";

    }


    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddForm(Model model) {

        model.addAttribute("title", "Add a New Deed");
        model.addAttribute(new Deed());
        return "add-deed";
    }

    @RequestMapping(value="add", method = RequestMethod.POST)
    public String processAddForm(@ModelAttribute @Valid Deed newDeed,
                                      Errors errors, Model model) {

            deedDao.save(newDeed);
            model.addAttribute("title", "Today's Deed");
            model.addAttribute("todaysDeed", newDeed);
//            model.addAttribute("errors", errors);

            return "index";
        }



    @RequestMapping(value="deed-completed/{id}", method = RequestMethod.GET)
    public String deedCompleted(Model model, @PathVariable int id) {
        //TODO: what page should you land on after submitting completion
        //get the deed that was completed from the url
        Deed completedDeed = deedDao.findOne(id);

        //change the value of completed
        completedDeed.setCompleted(true);
        deedDao.save(completedDeed);

        return "deed-completed";
    }
}
