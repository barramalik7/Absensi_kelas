package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;

@Entity
public class Absensi extends Model{

	public date waktu;
	public string semester;
	public string form;

	public date getWaktu() {
		return this.waktu;
	}

	/**
	 * 
	 * @param waktu
	 */
	public void setWaktu(date waktu) {
		this.waktu = waktu;
	}

	public string getSemester() {
		return this.semester;
	}

	/**
	 * 
	 * @param semester
	 */
	public void setSemester(string semester) {
		this.semester = semester;
	}

	public string getForm05() {
		// TODO - implement Absensi.getForm05
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param form05
	 */
	public void setForm05(string form05) {
		// TODO - implement Absensi.setForm05
		throw new UnsupportedOperationException();
	}

}