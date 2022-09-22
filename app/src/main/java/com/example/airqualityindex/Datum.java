
package com.example.airqualityindex;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "mold_level",
    "aqi",
    "pm10",
    "co",
    "o3",
    "predominant_pollen_type",
    "so2",
    "pollen_level_tree",
    "pollen_level_weed",
    "no2",
    "pm25",
    "pollen_level_grass"
})
@Generated("jsonschema2pojo")
public class Datum {

    @JsonProperty("mold_level")
    private Integer moldLevel;
    @JsonProperty("aqi")
    private Integer aqi;
    @JsonProperty("pm10")
    private Integer pm10;
    @JsonProperty("co")
    private Double co;
    @JsonProperty("o3")
    private Double o3;
    @JsonProperty("predominant_pollen_type")
    private String predominantPollenType;
    @JsonProperty("so2")
    private Double so2;
    @JsonProperty("pollen_level_tree")
    private Integer pollenLevelTree;
    @JsonProperty("pollen_level_weed")
    private Integer pollenLevelWeed;
    @JsonProperty("no2")
    private Double no2;
    @JsonProperty("pm25")
    private Integer pm25;
    @JsonProperty("pollen_level_grass")
    private Integer pollenLevelGrass;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("mold_level")
    public Integer getMoldLevel() {
        return moldLevel;
    }

    @JsonProperty("mold_level")
    public void setMoldLevel(Integer moldLevel) {
        this.moldLevel = moldLevel;
    }

    @JsonProperty("aqi")
    public Integer getAqi() {
        return aqi;
    }

    @JsonProperty("aqi")
    public void setAqi(Integer aqi) {
        this.aqi = aqi;
    }

    @JsonProperty("pm10")
    public Integer getPm10() {
        return pm10;
    }

    @JsonProperty("pm10")
    public void setPm10(Integer pm10) {
        this.pm10 = pm10;
    }

    @JsonProperty("co")
    public Double getCo() {
        return co;
    }

    @JsonProperty("co")
    public void setCo(Double co) {
        this.co = co;
    }

    @JsonProperty("o3")
    public Double getO3() {
        return o3;
    }

    @JsonProperty("o3")
    public void setO3(Double o3) {
        this.o3 = o3;
    }

    @JsonProperty("predominant_pollen_type")
    public String getPredominantPollenType() {
        return predominantPollenType;
    }

    @JsonProperty("predominant_pollen_type")
    public void setPredominantPollenType(String predominantPollenType) {
        this.predominantPollenType = predominantPollenType;
    }

    @JsonProperty("so2")
    public Double getSo2() {
        return so2;
    }

    @JsonProperty("so2")
    public void setSo2(Double so2) {
        this.so2 = so2;
    }

    @JsonProperty("pollen_level_tree")
    public Integer getPollenLevelTree() {
        return pollenLevelTree;
    }

    @JsonProperty("pollen_level_tree")
    public void setPollenLevelTree(Integer pollenLevelTree) {
        this.pollenLevelTree = pollenLevelTree;
    }

    @JsonProperty("pollen_level_weed")
    public Integer getPollenLevelWeed() {
        return pollenLevelWeed;
    }

    @JsonProperty("pollen_level_weed")
    public void setPollenLevelWeed(Integer pollenLevelWeed) {
        this.pollenLevelWeed = pollenLevelWeed;
    }

    @JsonProperty("no2")
    public Double getNo2() {
        return no2;
    }

    @JsonProperty("no2")
    public void setNo2(Double no2) {
        this.no2 = no2;
    }

    @JsonProperty("pm25")
    public Integer getPm25() {
        return pm25;
    }

    @JsonProperty("pm25")
    public void setPm25(Integer pm25) {
        this.pm25 = pm25;
    }

    @JsonProperty("pollen_level_grass")
    public Integer getPollenLevelGrass() {
        return pollenLevelGrass;
    }

    @JsonProperty("pollen_level_grass")
    public void setPollenLevelGrass(Integer pollenLevelGrass) {
        this.pollenLevelGrass = pollenLevelGrass;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
