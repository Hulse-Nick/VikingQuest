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
public class Scene implements Serializable{
    
    private boolean combat;
    private String type;
    private String description;
    private boolean visited;
    
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public Scene() {
    }

    public boolean isCombat() {
        return combat;
    }

    public void setCombat(boolean combat) {
        this.combat = combat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public String toString() {
        return "Scene{" + "combat=" + combat + ", type=" + type + ", description=" + description + ", visited=" + visited + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.combat ? 1 : 0);
        hash = 17 * hash + Objects.hashCode(this.type);
        hash = 17 * hash + Objects.hashCode(this.description);
        hash = 17 * hash + (this.visited ? 1 : 0);
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
        final Scene other = (Scene) obj;
        if (this.combat != other.combat) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        return true;
    }
    
    
}
