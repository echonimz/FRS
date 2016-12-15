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
public class Airline {
    private String airlineid;
    private String name;

    public Airline() {
    }

    public Airline(String airlineid, String name) {
        this.airlineid = airlineid;
        this.name = name;
    }

    public String getAirlineid() {
        return airlineid;
    }

    public String getName() {
        return name;
    }

    public void setAirlineid(String airlineid) {
        this.airlineid = airlineid;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Airline{" + "airlineid=" + airlineid + ", name=" + name + '}';
    }
    
    
}
