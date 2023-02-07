package com.sheridancollege.sheridancollege.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sheridancollege.sheridancollege.dto.School;
import com.sheridancollege.sheridancollege.service.SchoolService;

@Controller
public class SchoolController {
@Autowired
private SchoolService schoolService;

@GetMapping("/addSchool")
public String customerForm(Model model) {
    model.addAttribute("school", new School());
    return "addSchool";
}

@PostMapping("/addSchool")
public String createCustomer(School school, Model model) {
    schoolService.addSchool(school);
    return "addSchool";
}

@GetMapping("/getSchools")
public String getCustomers(Model model) {
    model.addAttribute("schools", schoolService.getAllSchools());
    return "getSchools";
}
}
