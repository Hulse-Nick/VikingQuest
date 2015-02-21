/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingquest.model;

/**
 *
 * @author Madeleine
 */
public class Game {
    private double score;
    private double timesBeaten;

    public Game() {
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getTimesBeaten() {
        return timesBeaten;
    }

    public void setTimesBeaten(double timesBeaten) {
        this.timesBeaten = timesBeaten;
    }

    @Override
    public String toString() {
        return "Game{" + "score=" + score + ", timesBeaten=" + timesBeaten + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.score) ^ (Double.doubleToLongBits(this.score) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.timesBeaten) ^ (Double.doubleToLongBits(this.timesBeaten) >>> 32));
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.score) != Double.doubleToLongBits(other.score)) {
            return false;
        }
        if (Double.doubleToLongBits(this.timesBeaten) != Double.doubleToLongBits(other.timesBeaten)) {
            return false;
        }
        return true;
    }
    
        
    
}
