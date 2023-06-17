package com.kpo.springshaurma.controller;

import com.kpo.springshaurma.service.ServiceSample;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Slf4j
@Controller
@RequestMapping("/orders/current")
@SessionAttributes("order")
@RequiredArgsConstructor
public class OrderController {
    private final ServiceSample serviceSample;

    @GetMapping
    public String home() {
        return "order";
    }
    // Don't forget to inject SessionStatus sessionStatus
}
