/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author sindhusrinivas
 */
public class PatientDirectory {
    
    private ArrayList<Patient> PatientDirectory = new ArrayList();;
    public static HashMap<String, Patient> map = new HashMap<>();

    public HashMap<String, Patient> getMap() {
        return map;
    }

    public void setMap(HashMap<String, Patient> map) {
        this.map = map;
    }

    public ArrayList<Patient> getPatientDirectory() {
        return PatientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> PatientDirectory) {
        this.PatientDirectory = PatientDirectory;
    }
    
}