package com.test.socialmedia.Model;

public class DataSliderFace {
    String titil;
    String url;

    public DataSliderFace() {
    }

    public DataSliderFace(String titil, String url) {
        this.titil = titil;
        this.url = url;
    }

    public String getTitil() {
        return titil;
    }

    public void setTitil(String titil) {
        this.titil = titil;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
