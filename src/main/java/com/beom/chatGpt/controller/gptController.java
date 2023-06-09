package com.beom.chatGpt.controller;

import com.beom.chatGpt.service.ChatService;
import io.github.flashvayne.chatgpt.service.ChatgptService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@Slf4j
public class gptController {

    private final ChatService chatService;
    private final ChatgptService chatgptService;

    //chat-gpt 와 간단한 채팅 서비스 소스
    @PostMapping("/chatgpt")
    public String test(@RequestBody String question){
        return chatService.getChatResponse(question);
        //\n\nAs an AI language model, I don't have feelings, but I'm functioning well. Thank you for asking. How can I assist you today?
    }

    @GetMapping("/api/healthcheck")
    public String healthCheck()
    {
        return "healthCheck";
    }

}
