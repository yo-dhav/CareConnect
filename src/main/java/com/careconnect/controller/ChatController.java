package com.careconnect.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.careconnect.service.ConversationService;

@RestController
@CrossOrigin(origins = "*") 
public class ChatController {

    private final ConversationService conversationService;

    public ChatController(ConversationService conversationService) {
        this.conversationService = conversationService;
    }

    @PostMapping("/chat")
    public String chat(
            @RequestHeader(value = "X-Session-ID", defaultValue = "unknown") String sessionId, 
            @RequestBody String message
    ) {
        return conversationService.handleMessage(sessionId, message);
    }
}