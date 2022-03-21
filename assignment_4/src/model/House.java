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
public class House extends Community {
    
    int houseNumber;
    Person setPerson;

    @Override
    public Person getSetPerson() {
        return setPerson;
    }
    @Override
    public void setSetPerson(Person setPerson) {
        this.setPerson = setPerson;
    }
    
    @Override
    public int getHouseNo() {
        return houseNumber;
    }
    @Override
    public void setHouseNo(int houseNo) {
        this.houseNumber = houseNo;
    }
    
    
    public int getPincode() {
        return super.getPincode();
    }

    
    public void setPincode(int pincode) {
        super.setPincode(pincode);
    }
    
   
    public String getCommunityName() {
        return super.getCommunityName();
    }
   
    public void setCommunityName(String communityName) {
        super.setCommunityName(communityName);
    }
    
    
    public void setCityName(String cityName) {
     super.setCityName(cityName);;
    }
    
    public void setCommunityList(){
        super.setCommunityList(this);
    }

}