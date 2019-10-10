package com.company;

import java.util.LinkedList;

public class Display {

    private LinkedList<String> recordLabel;
    private LinkedList<Band> signedBands;

    public Display(){}

    public LinkedList<String> getRecordLabel() {
        return recordLabel;
    }

    public void setRecordLabel(LinkedList<String> recordLabel) {
        this.recordLabel = recordLabel;
    }
    public void addRecordLabel(String recordLabel) {
        this.recordLabel.add(recordLabel);
    }

    public LinkedList<Band> getSignedBands() {
        return signedBands;
    }

    public void setSignedBands(LinkedList<Band> signedBands) {
        this.signedBands = signedBands;
    }
    public void addSignedBands(Band signedBands) {
        this.signedBands.add(signedBands);
    }

    @Override
    public String toString() {
        return "Display{" +
                "recordLabel='" + recordLabel + '\'' +
                ", signedBands=" + signedBands +
                '}';
    }
}
