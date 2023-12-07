public class Mahasiswa extends User {

	private string nama;
	private string nim;

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