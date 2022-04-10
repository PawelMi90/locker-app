package com.example.lockerapp.service;

import com.example.lockerapp.model.Locker;
import com.example.lockerapp.model.Section;

import java.util.List;


public class LockerService {

private List<Section> listOfSection;

    public LockerService() {
    }

    public LockerService(List<Section> listOfSection) {
        this.listOfSection = listOfSection;
    }

    public List<Section> getListOfSection() {
        return listOfSection;
    }

    public void setListOfSection(List<Section> listOfSection) {
        this.listOfSection = listOfSection;
    }


}
