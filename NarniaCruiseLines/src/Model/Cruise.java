package Model;

import Model.Sailor.Sailors;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/*
 *2020/12/5创建by@Shaotong
 * 题目理解：
 * 随机的创建一个航行，每个航行包括船、船员、目标港口
 * 需要为航行增加乘客
 */
public class Cruise {
    private int cruiseSerialNumber;
    private String sailingDate;
    private String returnDate;
    private String departurePort;//邮轮的来去是一个地方
    //有一种依赖关系
    private Ship ship;
    private ArrayList<Sailors> sailors;
    private ArrayList<String> ports;
    private ArrayList<Passenger> passengers;

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public ArrayList<Sailors> getSailors() {
        return sailors;
    }

    public void setSailors(ArrayList<Sailors> sailors) {
        this.sailors = sailors;
    }

    public ArrayList<String> getPorts() {
        return ports;
    }

    public void setPorts(ArrayList<String> ports) {
        this.ports = ports;
    }

    public int getCruiseSerialNumber() {
        return cruiseSerialNumber;
    }

    public void setCruiseSerialNumber(int cruiseSerialNumber) {
        this.cruiseSerialNumber = cruiseSerialNumber;
    }

    public String getSailingDate() {
        return sailingDate;
    }

    public void setSailingDate(String sailingDate) {
        this.sailingDate = sailingDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getDeparturePort() {
        return departurePort;
    }

    public void setDeparturePort(String departurePort) {
        this.departurePort = departurePort;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }
}
