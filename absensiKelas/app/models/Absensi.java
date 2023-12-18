package models;

import java.util.Date;
import javax.persistence.Entity;
import play.db.jpa.Model;

@Entity
public class Absensi extends Model {

    public Date waktu;
    public String semester;
    public String form;

    public Date getWaktu() {
        return this.waktu;
    }

    /**
     * 
     * @param waktu
     */
    public void setWaktu(Date waktu) {
        this.waktu = waktu;
    }

    public String getSemester() {
        return this.semester;
    }

    /**
     * 
     * @param semester
     */
    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getForm05() {
        // TODO - implement Absensi.getForm05
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param form05
     */
    public void setForm05(String form05) {
        // TODO - implement Absensi.setForm05
        throw new UnsupportedOperationException();
    }

}
