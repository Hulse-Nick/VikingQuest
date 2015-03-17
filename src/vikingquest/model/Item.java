/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingquest.model;

import java.util.Objects;

/**
 *
 * @author Madeleine
 */
public class Item {
    
    private String itemType;
    private double usesLeft;
    private double weight;
    private String title;
    private int attack;
//    private double attack;
    private double defense;
    private String special;
    

    public Item() {
    }

    public double getUsesLeft() {
        return usesLeft;
    }

    public void setUsesLeft(double usesLeft) {
        this.usesLeft = usesLeft;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAttack() {
//      public double getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        //public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.itemType);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.usesLeft) ^ (Double.doubleToLongBits(this.usesLeft) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.weight) ^ (Double.doubleToLongBits(this.weight) >>> 32));
        hash = 59 * hash + Objects.hashCode(this.title);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.attack) ^ (Double.doubleToLongBits(this.attack) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.defense) ^ (Double.doubleToLongBits(this.defense) >>> 32));
        hash = 59 * hash + Objects.hashCode(this.special);
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
        final Item other = (Item) obj;
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.usesLeft) != Double.doubleToLongBits(other.usesLeft)) {
            return false;
        }
        if (Double.doubleToLongBits(this.weight) != Double.doubleToLongBits(other.weight)) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (Double.doubleToLongBits(this.attack) != Double.doubleToLongBits(other.attack)) {
            return false;
        }
        if (Double.doubleToLongBits(this.defense) != Double.doubleToLongBits(other.defense)) {
            return false;
        }
        if (!Objects.equals(this.special, other.special)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "itemType=" + itemType + ", usesLeft=" + usesLeft + ", weight=" + weight + ", title=" + title + ", attack=" + attack + ", defense=" + defense + ", special=" + special + '}';
    }

    
    
    
}
