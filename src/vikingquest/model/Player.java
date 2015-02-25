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
 * @author Madeleine
 */
public class Player implements Serializable {
    private String name;
    private String costume;
    private String backpack;
    private String companion;
    private double score;
    private double attack;
    private double defense;

    
    
    public String getCompanion() {
        return companion;
    }

    public void setCompanion(String companion) {
        this.companion = companion;
    }
    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getCostume() {
        return costume;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }

    public String getBackpack() {
        return backpack;
    }

    public void setBackpack(String backpack) {
        this.backpack = backpack;
    }

    public Player(String costume, String backpack, double score) {
        this.costume = costume;
        this.backpack = backpack;
        this.score = score;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.costume);
        hash = 23 * hash + Objects.hashCode(this.backpack);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.score) ^ (Double.doubleToLongBits(this.score) >>> 32));
        return hash;
    }

    public Player() {
    }

    @Override
    public String toString() {
        return "Player{" + "costume=" + costume + ", backpack=" + backpack + ", score=" + score + '}';
    }
        

}

