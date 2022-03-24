package com.sparta.week4prac.controller;


import com.sparta.week4prac.models.ItemDto;
import com.sparta.week4prac.utils.SearchCity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class SearchRequestController {

    private final SearchCity searchCity;

    @GetMapping("api/search")
    public List<ItemDto> getItems(@RequestParam String query){
        String resultString = searchCity.search(query);
        return searchCity.fromJSONtoItems(resultString);
    }
}
