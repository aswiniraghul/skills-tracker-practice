package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/")
public class SkillsController {

    @GetMapping
    public String skills() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String form() {
        return "<html>" +
                "<body>" +
                "<form method='get' action='display'>" +
                "<span>Name:</span><br>" +
                "<input name='name'><br>" +
                "<span>My favorite language:</span><br>" +
                "<select name='favorite'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<span>My second favorite language:</span><br>" +
                "<select name='secondfavorite'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<span>My third favorite language:</span><br>" +
                "<select name='thirdfavorite'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("display")
    public static String display(@RequestParam String name, @RequestParam String favorite, @RequestParam String secondfavorite, @RequestParam String thirdfavorite) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + favorite + "</li>" +
                "<li>" + secondfavorite + "</li>" +
                "<li>" + thirdfavorite + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
}
