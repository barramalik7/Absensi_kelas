package models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class Jadwal extends Model {

    public String hari;
    public String jam;

    public String getHari() {
        return this.hari;
    }

    /**
     * 
     * @param hari
     */
    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getJam() {
        return this.jam;
    }

    /**
     * 
     * @param jam
     */
    public void setJam(String jam) {
        this.jam = jam;
    }

}
