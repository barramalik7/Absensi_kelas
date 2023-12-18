package models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class Dosen extends Model {

    public String nama_dosen;
    public String nip;

    public String getNama_dosen() {
        return this.nama_dosen;
    }

    /**
     * 
     * @param nama_dosen
     */
    public void setNama_dosen(String nama_dosen) {
        this.nama_dosen = nama_dosen;
    }

    public String getNip() {
        return this.nip;
    }

    /**
     * 
     * @param nip
     */
    public void setNip(String nip) {
        this.nip = nip;
    }

}
