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
public class NPC implements Serializable{
    private String has;
    private String needs;

    public NPC() {
    }
    
    public String getHas() {
        return has;
    }

    public void setHas(String has) {
        this.has = has;
    }

    public String getNeeds() {
        return needs;
    }

    public void setNeeds(String needs) {
        this.needs = needs;
    }

    @Override
    public String toString() {
        return "NPC{" + "has=" + has + ", needs=" + needs + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.has);
        hash = 29 * hash + Objects.hashCode(this.needs);
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
        final NPC other = (NPC) obj;
        if (!Objects.equals(this.has, other.has)) {
            return false;
        }
        if (!Objects.equals(this.needs, other.needs)) {
            return false;
        }
        return true;
    }
    
    
    
}
