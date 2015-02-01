/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingquest.model;

import java.io.Serializable;

/**
 *
 * @author Nicholas
 */
public class Location implements Serializable {
    private double xCoord;
    private double yCoord;

    public double getxCoord() {
        return xCoord;
    }

    public void setxCoord(double xCoord) {
        this.xCoord = xCoord;
    }

    public double getyCoord() {
        return yCoord;
    }

    public void setyCoord(double yCoord) {
        this.yCoord = yCoord;
    }

    @Override
    public String toString() {
        return "Location{" + "xCoord=" + xCoord + ", yCoord=" + yCoord + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.xCoord) ^ (Double.doubleToLongBits(this.xCoord) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.yCoord) ^ (Double.doubleToLongBits(this.yCoord) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.xCoord) != Double.doubleToLongBits(other.xCoord)) {
            return false;
        }
        if (Double.doubleToLongBits(this.yCoord) != Double.doubleToLongBits(other.yCoord)) {
            return false;
        }
        return true;
    }

    
    
    public Location() {
    }
    
    
    
}
