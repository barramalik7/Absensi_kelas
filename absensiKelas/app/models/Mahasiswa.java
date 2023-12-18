package models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class Mahasiswa extends Model {

    public String nama;
    public String nim;

    public String getNama() {
        return this.nama;
    }

    /**
     * 
     * @param nama
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return this.nim;
    }

    /**
     * 
     * @param nim
     */
    public void setNim(String nim) {
        this.nim = nim;
    }

}
