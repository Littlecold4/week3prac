package com.sparta.week4prac.models;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter // get 함수를 일괄적으로 만들어줍니다.
@NoArgsConstructor // 기본 생성자를 만들어줍니다.
@Entity // DB 테이블 역할을 합니다.
public class City extends Timestamped{

    // ID가 자동으로 생성 및 증가합니다.
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    // 반드시 값을 가지도록 합니다.
    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String link;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String raddress;

    @Column(nullable = false)
    private Boolean heart;

    public City(CityRequestDto requestDto){
        this.title=requestDto.getTitle();
        this.link = requestDto.getLink();
        this.address= requestDto.getAddress();
        this.raddress= requestDto.getRaddress();
        this.category= requestDto.getCategory();
        this.heart = false;
    }

    public void update(MyCityRequestDto requestDto){
        this.heart = requestDto.getHeart();
    }
}