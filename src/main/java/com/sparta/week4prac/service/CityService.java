package com.sparta.week4prac.service;

import com.sparta.week4prac.models.City;
import com.sparta.week4prac.models.CityRepository;
import com.sparta.week4prac.models.MyCityRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class CityService {
    private final CityRepository cityRepository;

    @Transactional
    public Long update(Long id, MyCityRequestDto requestDto){
        City city = cityRepository.findById(id).orElseThrow(
                ()-> new NullPointerException()
        );
        city.update(requestDto);
        return id;
    }
}
