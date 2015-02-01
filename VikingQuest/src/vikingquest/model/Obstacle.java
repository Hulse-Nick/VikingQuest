/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingquest.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Nicholas
 */
public class Obstacle implements Serializable {
    private String obstacleType;
    private String weakness;

    public String getObstacleType() {
        return obstacleType;
    }

    public void setObstacleType(String obstacleType) {
        this.obstacleType = obstacleType;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public Obstacle() {
    }

    @Override
    public String toString() {
        return "Obstacle{" + "obstacleType=" + obstacleType + ", weakness=" + weakness + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.obstacleType);
        hash = 37 * hash + Objects.hashCode(this.weakness);
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
        final Obstacle other = (Obstacle) obj;
        if (!Objects.equals(this.obstacleType, other.obstacleType)) {
            return false;
        }
        if (!Objects.equals(this.weakness, other.weakness)) {
            return false;
        }
        return true;
    }
    
    
}
