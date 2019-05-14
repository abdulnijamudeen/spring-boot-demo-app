package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/", "/index"})
    public String index() {
        return "site/index";
    }

    @GetMapping("/about")
    public String about() {
        return "site/about";
    }

    @GetMapping("/service")
    public String service() {
        return "site/service";
    }

    @GetMapping("/project")
    public String project() {
        return "site/project";
    }

    @GetMapping("/blog")
    public String blog() {
        return "site/blog";
    }

    @GetMapping("/single-blog")
    public String singleBlog() {
        return "site/single-blog";
    }

    @GetMapping("/elements")
    public String elements() {
        return "site/elements";
    }

    @GetMapping("/contact")
    public String contact() {
        return "site/contact";
    }

}