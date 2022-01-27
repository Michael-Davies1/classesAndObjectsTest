package com.company;

import com.sun.org.apache.xpath.internal.objects.XString;

public class device {
    protected String identificationCode;
    protected String makeAndModel;
    protected String owner;
    protected String problemDescription;
    protected String repairNotes;
    protected int priority;

    @Override
    public String toString() {
        return "device{" +
                "identificationCode='" + identificationCode + '\'' +
                ", makeAndModel='" + makeAndModel + '\'' +
                ", owner='" + owner + '\'' +
                ", problemDescription='" + problemDescription + '\'' +
                ", repairNotes='" + repairNotes + '\'' +
                ", priority=" + priority +
                '}';



    }

    public String getIdentificationCode() {
        return identificationCode;
    }

    public void setIdentificationCode(String identificationCode) {
        this.identificationCode = identificationCode;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public String getRepairNotes() {
        return repairNotes;
    }

    public void setRepairNotes(String repairNotes) {
        this.repairNotes = repairNotes;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public device(String identificationCode, String makeAndModel, String owner, String problemDescription, String repairNotes, int priority) {
        this.identificationCode = identificationCode;
        this.makeAndModel = makeAndModel;
        this.owner = owner;
        this.problemDescription = problemDescription;
        this.repairNotes = repairNotes;
        this.priority = priority;
    }
}
