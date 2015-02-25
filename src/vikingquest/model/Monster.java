/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vikingquest.model;

import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author Nicholas
 */
public class Monster {
    
    private String title;
    private String difficulty;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.title);
        hash = 61 * hash + Objects.hashCode(this.difficulty);
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
        final Monster other = (Monster) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.difficulty, other.difficulty)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Monster{" + "title=" + title + ", difficulty=" + difficulty + '}';
    }

    
    
}
