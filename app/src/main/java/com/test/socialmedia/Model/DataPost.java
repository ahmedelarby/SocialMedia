package com.test.socialmedia.Model;

import java.util.ArrayList;
import java.util.List;

public class DataPost {
    String nameperson;
    String time;
    String imageprofile;
    String post;
    String keyprofile;
    String keypost;
    List<String> listimage;

    public DataPost() {
    }

    public DataPost(String nameperson, String time, String imageprofile, String post, String keyprofile, String keypost, List<String> listimage) {
        this.nameperson = nameperson;
        this.time = time;
        this.imageprofile = imageprofile;
        this.post = post;
        this.keyprofile = keyprofile;
        this.keypost = keypost;
        this.listimage = listimage;
    }

    public String getNameperson() {
        return nameperson;
    }

    public void setNameperson(String nameperson) {
        this.nameperson = nameperson;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getImageprofile() {
        return imageprofile;
    }

    public void setImageprofile(String imageprofile) {
        this.imageprofile = imageprofile;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getKeyprofile() {
        return keyprofile;
    }

    public void setKeyprofile(String keyprofile) {
        this.keyprofile = keyprofile;
    }

    public String getKeypost() {
        return keypost;
    }

    public void setKeypost(String keypost) {
        this.keypost = keypost;
    }

    public List<String> getListimage() {
        return listimage;
    }

    public void setListimage(List<String> listimage) {
        this.listimage = listimage;
    }
}
