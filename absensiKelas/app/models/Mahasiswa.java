package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;
public class Mahasiswa extends Model {

	public string nama;
	public string nim;

	public string getNama() {
		return this.nama;
	}

	/**
	 * 
	 * @param nama
	 */
	public void setNama(string nama) {
		this.nama = nama;
	}

	public string getNim() {
		return this.nim;
	}

	/**
	 * 
	 * @param nim
	 */
	public void setNim(string nim) {
		this.nim = nim;
	}

}