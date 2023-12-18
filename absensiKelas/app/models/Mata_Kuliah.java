package models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class Mata_Kuliah extends Model {

    public String mata_kuliah;

    public String getMata_kuliah() {
        return this.mata_kuliah;
    }

    /**
     * 
     * @param mata_kuliah
     */
    public void setMata_kuliah(String mata_kuliah) {
        this.mata_kuliah = mata_kuliah;
    }

}
