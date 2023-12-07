package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;

@Entity
public class Jadwal extends Model{

	private string hari;
	private string jam;

	public string getHari() {
		return this.hari;
	}

	/**
	 * 
	 * @param hari
	 */
	public void setHari(string hari) {
		this.hari = hari;
	}

	public string getJam() {
		return this.jam;
	}

	/**
	 * 
	 * @param jam
	 */
	public void setJam(string jam) {
		this.jam = jam;
	}

}