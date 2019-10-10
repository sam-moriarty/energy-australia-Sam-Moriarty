package com.company;

import java.util.Date;
import java.util.LinkedList;

public class Band {
    private String name;
    private String recordLabel;
    private LinkedList<String> festivalPlayedAt;

    public Band(){

    }

    public LinkedList<String> getFestivalPlayedAt() {
        return festivalPlayedAt;
    }

    public void setFestivalPlayedAt(LinkedList<String> festivalPlayedAt) {
        this.festivalPlayedAt = festivalPlayedAt;
    }
    public void addFestivalPlayedAt(String festivalPlayedAt) {
        this.festivalPlayedAt.add(festivalPlayedAt);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecordLabel() {
        return recordLabel;
    }

    public void setRecordLabel(String recordLabel) {
        this.recordLabel = recordLabel;
    }


    @Override
    public String toString() {
        return "Band{" +
                "name='" + name + '\'' +
                ", recordLabel='" + recordLabel + '\'' +
                ", festivalPlayedAt=" + festivalPlayedAt +
                '}';
    }
}
