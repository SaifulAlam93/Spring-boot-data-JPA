package com.home.project.controller;


import com.home.project.entity.Hello;
import com.home.project.entity.Message;
import com.home.project.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(value = "http://localhost:4200", allowCredentials = "true")

public class WebSocketController {
//    private final SimpMessagingTemplate template;
//
//    @Autowired
//    WebSocketController(SimpMessagingTemplate template){
//        this.template = template;
//    }
//
//    @MessageMapping("/send/message")
//    public void sendMessage(String message){
//        System.out.println(message);
//        this.template.convertAndSend("/message",  message);
//    }

    @Autowired
    private GreetingService greetingService;

    @MessageMapping("/hello")
    @SendTo("/topic/greeting")
    public Message greeting() {
        return greetingService.getMessage();
    }
}
