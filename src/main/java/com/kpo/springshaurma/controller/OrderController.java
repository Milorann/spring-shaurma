package com.kpo.springshaurma.controller;

import com.kpo.springshaurma.model.ShaurmaOrder;
import com.kpo.springshaurma.repository.OrderRepository;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
@RequestMapping("/orders/current")
@SessionAttributes("order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderRepository orderRepository;
    @GetMapping
    public ModelAndView getAllEmployees() {
        ModelAndView mav = new ModelAndView("order");
        mav.addObject("orders", orderRepository.findAll());
        return mav;
    }

    @PostMapping
    public String redirect(SessionStatus sessionStatus) {
        sessionStatus.setComplete();
        return "redirect:/create";
    }
}
