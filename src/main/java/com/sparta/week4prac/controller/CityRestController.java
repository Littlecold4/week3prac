package com.sparta.week4prac.controller;


import com.sparta.week4prac.models.City;
import com.sparta.week4prac.models.CityRepository;
import com.sparta.week4prac.models.CityRequestDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CityRestController {

    private final CityRepository cityRepository;

    @GetMapping("/api/city")
    public List<City> readCity(){
        return cityRepository.findAll();
    }

    @PostMapping("/api/city")
    public City creatCity(@RequestBody CityRequestDto requestDto){
        City city = new City(requestDto);
        return cityRepository.save(city);
    }
}
