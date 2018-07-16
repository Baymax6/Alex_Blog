package com.alex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chat")
public class ChatController
{
    @GetMapping("/showChatPage")
    public String showChatPage()
    {
        return "TestChat";
    }
}
