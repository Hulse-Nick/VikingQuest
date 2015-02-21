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
    private double usesLeft;
    private String neededBy;
    private String itemType;

    public Item() {
    }

    public double getUsesLeft() {
        return usesLeft;
    }

    public void setUsesLeft(double usesLeft) {
        this.usesLeft = usesLeft;
    }

    public String getNeededBy() {
        return neededBy;
    }

    public void setNeededBy(String neededBy) {
        this.neededBy = neededBy;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Override
    public String toString() {
        return "Item{" + "usesLeft=" + usesLeft + ", neededBy=" + neededBy + ", itemType=" + itemType + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.usesLeft) ^ (Double.doubleToLongBits(this.usesLeft) >>> 32));
        hash = 59 * hash + Objects.hashCode(this.neededBy);
        hash = 59 * hash + Objects.hashCode(this.itemType);
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
        if (Double.doubleToLongBits(this.usesLeft) != Double.doubleToLongBits(other.usesLeft)) {
            return false;
        }
        if (!Objects.equals(this.neededBy, other.neededBy)) {
            return false;
        }
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
        return true;
    }
    
    
    
}
