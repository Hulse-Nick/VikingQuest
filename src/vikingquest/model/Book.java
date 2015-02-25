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
public class Book implements Serializable {
    
    private String prevHint;
    private String currentHint;
    private String nextHint;
    private String hintLevel;

    
    
    public String getPrevHint() {
        return prevHint;
    }

    public void setPrevHint(String prevHint) {
        this.prevHint = prevHint;
    }

    public String getCurrentHint() {
        return currentHint;
    }

    public void setCurrentHint(String currentHint) {
        this.currentHint = currentHint;
    }

    public String getNextHint() {
        return nextHint;
    }

    public void setNextHint(String nextHint) {
        this.nextHint = nextHint;
    }

    public String getHintLevel() {
        return hintLevel;
    }

    public void setHintLevel(String hintLevel) {
        this.hintLevel = hintLevel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.prevHint);
        hash = 89 * hash + Objects.hashCode(this.currentHint);
        hash = 89 * hash + Objects.hashCode(this.nextHint);
        hash = 89 * hash + Objects.hashCode(this.hintLevel);
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
        final Book other = (Book) obj;
        if (!Objects.equals(this.prevHint, other.prevHint)) {
            return false;
        }
        if (!Objects.equals(this.currentHint, other.currentHint)) {
            return false;
        }
        if (!Objects.equals(this.nextHint, other.nextHint)) {
            return false;
        }
        if (!Objects.equals(this.hintLevel, other.hintLevel)) {
            return false;
        }
        return true;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" + "prevHint=" + prevHint + ", currentHint=" + currentHint + ", nextHint=" + nextHint + ", hintLevel=" + hintLevel + '}';
    }
    
    
    
}
