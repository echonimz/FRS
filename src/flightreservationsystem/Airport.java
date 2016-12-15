/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightreservationsystem;

/**
 *
 * @author Nim
 */
public class Airport {
    
    private String airportid;
    private String city;
    private String country;

    public Airport() {
        this.airportid =null ;
        this.city =null ;
        this.country =null ;
    }

    public Airport(String airportid, String city, String country) {
        this.airportid = airportid;
        this.city = city;
        this.country = country;
    }

    public String getAirportid() {
        return airportid;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public void setAirportid(String airportid) {
        this.airportid = airportid;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Airport{" + "airportid=" + airportid + ", city=" + city + ", country=" + country + '}';
    }
    
    
    
    
}
