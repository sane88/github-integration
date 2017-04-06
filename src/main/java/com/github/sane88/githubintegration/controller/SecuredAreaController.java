package com.github.sane88.githubintegration.controller;

import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecuredAreaController {
    @RequestMapping("/secured")
    public String secured(OAuth2Authentication authentication, Model model){
        model.addAttribute("name", authentication.getName());
        return "secured";
    }
}
