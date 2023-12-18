package models;
 
import java.util.*;
import javax.persistence.*;
 
import play.db.jpa.*;

@Entity
public class Mata_Kuliah extends Model{

	public string mata_kuliah;

	public string getMata_kuliah() {
		return this.mata_kuliah;
	}

	/**
	 * 
	 * @param mata_kuliah
	 */
	public void setMata_kuliah(string mata_kuliah) {
		this.mata_kuliah = mata_kuliah;
	}

}