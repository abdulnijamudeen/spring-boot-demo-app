package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private static final String HOME_PAGE = "site/index";
    private static final String ABOUTUS_PAGE = "site/about";
    private static final String SERVICE_PAGE = "site/service";
    private static final String PROJECT_PAGE = "site/project";
    private static final String BLOG_PAGE = "site/blog";
    private static final String SINGLE_BLOG_PAGE = "site/single-blog";
    private static final String ELEMENTS_PAGE = "site/elements";
    private static final String CONTACT_PAGE = "site/contact";

    @GetMapping(value = {"/", "/index"})
    public String index() {
        return HOME_PAGE;
    }

    @GetMapping("/about")
    public String about() {
        return ABOUTUS_PAGE;
    }

    @GetMapping("/service")
    public String service() {
        return SERVICE_PAGE;
    }

    @GetMapping("/project")
    public String project() {
        return PROJECT_PAGE;
    }

    @GetMapping("/blog")
    public String blog() {
        return BLOG_PAGE;
    }

    @GetMapping("/single-blog")
    public String singleBlog() {
        return SINGLE_BLOG_PAGE;
    }

    @GetMapping("/elements")
    public String elements() {
        return ELEMENTS_PAGE;
    }

    @GetMapping("/contact")
    public String contact() {
        return CONTACT_PAGE;
    }

}