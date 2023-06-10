package kz.bitlab.spring1.controller;


import kz.bitlab.spring1.db.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class Homecontroller {

    @GetMapping(value = "/")
    public String indexPage(Model model){
        ArrayList<Student> studentArray = DBManager.getStudents();
        model.addAttribute("studentter", studentArray);
        return "index";
    }

    @PostMapping(value = "/add")
    public String add(Student student){
        DBManager.add(student);
        return "redirect:/";
    }
    @GetMapping(value = "/add")
    public String addMusicPage(Model model) {
        ArrayList<Student> studentArray = DBManager.getStudents();
        model.addAttribute("studentter", studentArray);
        return "add-student";
    }
}
