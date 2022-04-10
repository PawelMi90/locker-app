package com.example.lockerapp.model;

import java.util.ArrayList;
import java.util.List;

public class Section {

    private Integer Id;
    private Integer numberOfUpperLockers;
    private Integer numberOfBottomLockers;
    private List<Locker> listOfLockers;

    public Section() {
    }

    public Section(Integer id, Integer numberOfUpperLockers, Integer numberOfBottomLockers) {
        Id = id;
        this.numberOfUpperLockers = numberOfUpperLockers;
        this.numberOfBottomLockers = numberOfBottomLockers;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getNumberOfUpperLockers() {
        return numberOfUpperLockers;
    }

    public void setNumberOfUpperLockers(Integer numberOfUpperLockers) {
        this.numberOfUpperLockers = numberOfUpperLockers;
    }

    public Integer getNumberOfBottomLockers() {
        return numberOfBottomLockers;
    }

    public void setNumberOfBottomLockers(Integer numberOfBottomLockers) {
        this.numberOfBottomLockers = numberOfBottomLockers;
    }

    public List<Locker> getListOfLockers() {
        return listOfLockers;
    }

    public void setListOfLockers() {
        this.listOfLockers = new ArrayList<Locker>();
    }

    public void setListOfLockers(List<Locker> listOfLockers) {
        this.listOfLockers = listOfLockers;
    }
}
