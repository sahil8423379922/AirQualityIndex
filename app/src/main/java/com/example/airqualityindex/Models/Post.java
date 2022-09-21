package com.example.airqualityindex.Models;

public class Post {

    public int mold_level;
    public int aqi;
    public double pm10;
    public double co;
    public double o3;
    public String predominant_pollen_type;
    public double so2;
    public int pollen_level_tree;
    public int pollen_level_weed;
    public double no2;
    public double pm25;
    public int pollen_level_grass;

    public Post(int mold_level, int aqi, double pm10, double co, double o3, String predominant_pollen_type, double so2, int pollen_level_tree, int pollen_level_weed, double no2, double pm25, int pollen_level_grass) {
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


    public int getMold_level() {
        return mold_level;
    }

    public void setMold_level(int mold_level) {
        this.mold_level = mold_level;
    }

    public int getAqi() {
        return aqi;
    }

    public void setAqi(int aqi) {
        this.aqi = aqi;
    }

    public double getPm10() {
        return pm10;
    }

    public void setPm10(double pm10) {
        this.pm10 = pm10;
    }

    public double getCo() {
        return co;
    }

    public void setCo(double co) {
        this.co = co;
    }

    public double getO3() {
        return o3;
    }

    public void setO3(double o3) {
        this.o3 = o3;
    }

    public String getPredominant_pollen_type() {
        return predominant_pollen_type;
    }

    public void setPredominant_pollen_type(String predominant_pollen_type) {
        this.predominant_pollen_type = predominant_pollen_type;
    }

    public double getSo2() {
        return so2;
    }

    public void setSo2(double so2) {
        this.so2 = so2;
    }

    public int getPollen_level_tree() {
        return pollen_level_tree;
    }

    public void setPollen_level_tree(int pollen_level_tree) {
        this.pollen_level_tree = pollen_level_tree;
    }

    public int getPollen_level_weed() {
        return pollen_level_weed;
    }

    public void setPollen_level_weed(int pollen_level_weed) {
        this.pollen_level_weed = pollen_level_weed;
    }

    public double getNo2() {
        return no2;
    }

    public void setNo2(double no2) {
        this.no2 = no2;
    }

    public double getPm25() {
        return pm25;
    }

    public void setPm25(double pm25) {
        this.pm25 = pm25;
    }

    public int getPollen_level_grass() {
        return pollen_level_grass;
    }

    public void setPollen_level_grass(int pollen_level_grass) {
        this.pollen_level_grass = pollen_level_grass;
    }
}
