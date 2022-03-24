package com.sparta.week4prac.models;

import lombok.Getter;
import org.json.JSONObject;

@Getter
public class ItemDto {
    String title;
    String link;
    String address;
    String raddress;
    String category;

    public ItemDto(JSONObject itemJson){
        this.title = itemJson.getString("title");
        this.link = itemJson.getString("link");
        this.address = itemJson.getString("address");
        this.raddress = itemJson.getString("roadAddress");
        this.category = itemJson.getString("category");
    }
}
