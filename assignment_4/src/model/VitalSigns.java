/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author sindhusrinivas
 */
public class VitalSigns {


    private int respiratoryUpperLimit;
    private int respiratoryLowerLimit;
    private int weightUpperLimit;
    private int weightLowerLimit;
    private int heartUpperLimit;
    private int heartLowerLimit;
    private int BpUpperLimit;
    private int BpLowerLimit;


    public int getrUB() {
        return respiratoryUpperLimit;
    }

    public void setrUB(int rUB) {
        this.respiratoryUpperLimit = rUB;
    }

    public int getrLB() {
        return respiratoryLowerLimit;
    }

    public void setrLB(int rLB) {
        this.respiratoryLowerLimit = rLB;
    }

    public int gethUB() {
        return heartUpperLimit;
    }

    public void sethUB(int hUB) {
        this.heartUpperLimit = hUB;
    }

    public int gethLB() {
        return heartLowerLimit;
    }

    public void sethLB(int hLB) {
        this.heartLowerLimit = hLB;
    }

    public int getBpUB() {
        return BpUpperLimit;
    }

    public void setBpUB(int bpUB) {
        this.BpUpperLimit = bpUB;
    }

    public int getBpLB() {
        return BpLowerLimit;
    }

    public void setBpLB(int bpLB) {
        this.BpLowerLimit = bpLB;
    }

    public int getWpUB() {
        return weightUpperLimit;
    }

    public void setWpUB(int wpUB) {
        this.weightUpperLimit = wpUB;
    }

    public int getWpLB() {
        return weightLowerLimit;
    }

    public void setWpLB(int wpLB) {
        this.weightLowerLimit = wpLB;
    }

   

    public VitalSigns() {

    }
    public VitalSigns(String age) {

        if (age.equals("NEWBORN")) {
            this.respiratoryLowerLimit = 30;
            this.respiratoryUpperLimit = 50;
            this.heartLowerLimit = 120;
            this.heartUpperLimit = 160;
            this.BpLowerLimit = 50;
            this.BpUpperLimit = 70;
            this.weightLowerLimit = 4; // Change this to double
            this.weightUpperLimit = 7;
        } else if (age.equals("INFANT")) {
            this.respiratoryLowerLimit = 20;
            this.respiratoryUpperLimit= 30;
            this.heartLowerLimit = 80;
            this.heartUpperLimit = 140;
            this.BpLowerLimit = 70;
            this.BpUpperLimit = 100;
            this.weightLowerLimit = 9; // Change this to double
            this.weightUpperLimit = 22;
        } else if (age.equals("TODDLER")) {
            this.respiratoryLowerLimit = 20;
            this.respiratoryUpperLimit = 30;
            this.heartLowerLimit = 80;
            this.heartUpperLimit = 130;
            this.BpLowerLimit = 80;
            this.BpUpperLimit = 110;
            this.weightLowerLimit = 22; // Change this to double
            this.weightUpperLimit = 31;
        } else if (age.equals("PRESCHOOLER")) {
            this.respiratoryLowerLimit = 20;
            this.respiratoryUpperLimit = 30;
            this.heartLowerLimit = 80;
            this.heartUpperLimit = 120;
            this.BpLowerLimit = 80;
            this.BpUpperLimit = 110;
            this.weightLowerLimit = 31; // Change this to double
            this.weightUpperLimit = 40;
        } else if (age.equals("SCHOOLAGE")) {
            this.respiratoryLowerLimit = 20;
            this.respiratoryUpperLimit = 30;
            this.heartLowerLimit = 70;
            this.heartUpperLimit = 110;
            this.BpLowerLimit = 80;
            this.BpUpperLimit = 120;
            this.weightLowerLimit = 41; // Change this to double
            this.weightUpperLimit = 92;
        } else if (age.equals("ADOLESCENT")) {
            this.respiratoryLowerLimit = 12;
            this.respiratoryUpperLimit = 20;
            this.heartLowerLimit = 55;
            this.heartUpperLimit = 105;
            this.BpLowerLimit = 50;
            this.BpUpperLimit = 120;
            this.weightLowerLimit = 110; // Change this to double
            this.weightUpperLimit = Integer.MAX_VALUE;
        }
    }
    int RespiratoryRate;
    int HeartRate;
    int BloodPressure;
    int WeightPounds;

    public int getRespiratoryRate() {
        return RespiratoryRate;
    }

    public void setRespiratoryRate(int RespiratoryRate) {
        this.RespiratoryRate = RespiratoryRate;
    }

    public int getHeartRate() {
        return HeartRate;
    }

    public void setHeartRate(int HeartRate) {
        this.HeartRate = HeartRate;
    }

    public int getBloodPressure() {
        return BloodPressure;
    }

    public void setBloodPressure(int BloodPressure) {
        this.BloodPressure = BloodPressure;
    }

    public int getWeightPounds() {
        return WeightPounds;
    }

    public void setWeightPounds(int WeightPounds) {
        this.WeightPounds = WeightPounds;
    }



}