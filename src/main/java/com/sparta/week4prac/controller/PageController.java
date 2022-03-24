package com.sparta.week4prac.controller;

import com.sparta.week4prac.models.City;
import com.sparta.week4prac.models.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class PageController {

    private final CityRepository cityRepository;

    @GetMapping("/town/{id}")
    public String detail(@PathVariable Long id, Model model){
        City city = cityRepository.findById(id).orElseThrow(
                ()->new NullPointerException()
        );
        model.addAttribute("response",city);
        return "town";
    }
}
