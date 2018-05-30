package com.bignerdranch.android.coolwheather.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    //县的ID
    private int id;
    //县的名字
    private String countryName;
    //县的天气
    private String weatherId;
    //所属城市的ID
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
