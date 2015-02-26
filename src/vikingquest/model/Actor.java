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
public class Actor implements Serializable{
    public String name;
    public double hp;
    public double attack;
    public double defense;
    public String special;

    
    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
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


    public Actor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.hp) ^ (Double.doubleToLongBits(this.hp) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.attack) ^ (Double.doubleToLongBits(this.attack) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.defense) ^ (Double.doubleToLongBits(this.defense) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.special);
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
        final Actor other = (Actor) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.hp) != Double.doubleToLongBits(other.hp)) {
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
        return "Actor{" + "name=" + name + ", hp=" + hp + ", attack=" + attack + ", defense=" + defense + ", special=" + special + '}';
    }

   
    

    
}

