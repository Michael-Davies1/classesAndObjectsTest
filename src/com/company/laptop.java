package com.company;

import java.util.ArrayList;

public class laptop extends device{
    public laptop(String identificationCode, String makeAndModel, String owner, String problemDescription, String repairNotes, int priority) {
        super(identificationCode, makeAndModel, owner, problemDescription, repairNotes, priority);
        components = new ArrayList<>();
    }
    private ArrayList<component>components;

    public ArrayList<component> getComponents() {
        return components;
    }
    public void addComponent(component item) {
        this.components.add(item);
    }
}
