package com.example.lockerapp.model;

public class Locker {

    private Integer Id;
    private Integer sectionId;
    private boolean isInUpperRow;
    private Integer numberInTheRow;

    public Locker() {
    }

    public Locker(Integer id, Integer sectionId, boolean isInUpperRow, Integer numberInTheRow) {
        Id = id;
        this.sectionId = sectionId;
        this.isInUpperRow = isInUpperRow;
        this.numberInTheRow = numberInTheRow;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public boolean isInUpperRow() {
        return isInUpperRow;
    }

    public void setInUpperRow(boolean inUpperRow) {
        isInUpperRow = inUpperRow;
    }

    public Integer getNumberInTheRow() {
        return numberInTheRow;
    }

    public void setNumberInTheRow(Integer numberInTheRow) {
        this.numberInTheRow = numberInTheRow;
    }
}
