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
public class Car {
   private String occupied;
   private String serialnumber;
   private String brand;
   private String city;
   private String registrationdate; 
   private String modelnumber;
   private int certificateyear;
   private String time;
   private int year;
   private int seats;

    public int getCertificateyear() {
        return certificateyear;
    }

    public void setCertificateyear(int certificateyear) {
        this.certificateyear = certificateyear;
    }
 

    public String getOccupied() {
        return occupied;
    }

    public void setOccupied(String occupied) {
        this.occupied = occupied;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegistrationdate() {
        return registrationdate;
    }

    public void setRegistrationdate(String registrationdate) {
        this.registrationdate = registrationdate;
    }

    public String getModelnumber() {
        return modelnumber;
    }

    public void setModelnumber(String modelnumber) {
        this.modelnumber = modelnumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

//    public int getCertificateyear() {
//        return certificateyear;
//    }
//
//    public void setCertiyear(int certiyear) {
//        this.certificateyear = certiyear;
//    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    @Override
    public String toString(){
    return registrationdate;
}

}
