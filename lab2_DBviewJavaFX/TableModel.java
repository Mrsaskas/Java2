package com.example.dbviewjavafx;


public class TableModel {
    String showid, tableid, city, lat, lng, country, iso2, admin_name, capital, population, population_proper;

    public TableModel(String city, String lat, String lng, String country, String iso2, String admin_name, String capital, String population, String population_proper) {


        this.city = city;
        this.lat = lat;
        this.lng = lng;
        this.country = country;
        this.iso2 = iso2;
        this.admin_name = admin_name;
        this.capital = capital;
        this.population = population;
        this.population_proper = population_proper;
    }


    public String getShowid() {
        return showid;
    }

    public void setShowid() {
        this.showid = showid;
    }

    public String getTableid() {
        return tableid;
    }

    public String getCity() {
        return city;
    }

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }

    public String getCountry() {
        return country;
    }

    public String getIso2() {
        return iso2;
    }

    public String getCapital() {
        return capital;
    }

    public String getPopulation() {
        return population;
    }

    public String getPopulation_proper() {
        return population_proper;
    }

    public void setShowid(String showid) {
        this.showid = showid;
    }

    public void setTableid(String tableid) {
        this.tableid = tableid;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public void setPopulation_proper(String population_proper) {
        this.population_proper = population_proper;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }
}

