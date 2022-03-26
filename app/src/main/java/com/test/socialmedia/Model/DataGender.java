package com.test.socialmedia.Model;

public class DataGender {
   private String selected ;
   private String male;
   private String female;

    public DataGender() {
    }

    public DataGender(String selected, String male, String female) {
        this.selected = selected;
        this.male = male;
        this.female = female;
    }

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public String getFemale() {
        return female;
    }

    public void setFemale(String female) {
        this.female = female;
    }
}
