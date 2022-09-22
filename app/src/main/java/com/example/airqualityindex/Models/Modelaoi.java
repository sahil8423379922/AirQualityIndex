package com.example.airqualityindex.Models;

public class Modelaoi {
    private String mold_level;
    private String aqi;
    private String pm10;
    private String co;
    private String o3;
    private String predominant_pollen_type;
    private String so2;
    private String pollen_level_tree;
    private String pollen_level_weed;
    private String no2;
    private String pm25;
    private String pollen_level_grass;


    public Modelaoi(String mold_level, String aqi, String pm10, String co, String o3, String predominant_pollen_type, String so2, String pollen_level_tree, String pollen_level_weed, String no2, String pm25, String pollen_level_grass) {
        this.mold_level = mold_level;
        this.aqi = aqi;
        this.pm10 = pm10;
        this.co = co;
        this.o3 = o3;
        this.predominant_pollen_type = predominant_pollen_type;
        this.so2 = so2;
        this.pollen_level_tree = pollen_level_tree;
        this.pollen_level_weed = pollen_level_weed;
        this.no2 = no2;
        this.pm25 = pm25;
        this.pollen_level_grass = pollen_level_grass;
    }

    public String getMold_level() {
        return mold_level;
    }

    public void setMold_level(String mold_level) {
        this.mold_level = mold_level;
    }

    public String getAqi() {
        return aqi;
    }

    public void setAqi(String aqi) {
        this.aqi = aqi;
    }

    public String getPm10() {
        return pm10;
    }

    public void setPm10(String pm10) {
        this.pm10 = pm10;
    }

    public String getCo() {
        return co;
    }

    public void setCo(String co) {
        this.co = co;
    }

    public String getO3() {
        return o3;
    }

    public void setO3(String o3) {
        this.o3 = o3;
    }

    public String getPredominant_pollen_type() {
        return predominant_pollen_type;
    }

    public void setPredominant_pollen_type(String predominant_pollen_type) {
        this.predominant_pollen_type = predominant_pollen_type;
    }

    public String getSo2() {
        return so2;
    }

    public void setSo2(String so2) {
        this.so2 = so2;
    }

    public String getPollen_level_tree() {
        return pollen_level_tree;
    }

    public void setPollen_level_tree(String pollen_level_tree) {
        this.pollen_level_tree = pollen_level_tree;
    }

    public String getPollen_level_weed() {
        return pollen_level_weed;
    }

    public void setPollen_level_weed(String pollen_level_weed) {
        this.pollen_level_weed = pollen_level_weed;
    }

    public String getNo2() {
        return no2;
    }

    public void setNo2(String no2) {
        this.no2 = no2;
    }

    public String getPm25() {
        return pm25;
    }

    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }

    public String getPollen_level_grass() {
        return pollen_level_grass;
    }

    public void setPollen_level_grass(String pollen_level_grass) {
        this.pollen_level_grass = pollen_level_grass;
    }
}
