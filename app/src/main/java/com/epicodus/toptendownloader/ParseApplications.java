package com.epicodus.toptendownloader;

import java.util.ArrayList;

/**
 * Created by kylederrick on 6/15/16.
 */
public class ParseApplications {
    private String xmlData;
    private ArrayList<Application> applications;

    public ParseApplications(String xmlData) {
        this.xmlData = xmlData;
        applications = new ArrayList<Application>();
    }

    public ArrayList<Application> getApplications() {
        return applications;
    }
}
