public class Dosen extends User {

	private string nama_dosen;
	private string nip;

	public string getNama_dosen() {
		return this.nama_dosen;
	}

	/**
	 * 
	 * @param nama_dosen
	 */
	public void setNama_dosen(string nama_dosen) {
		this.nama_dosen = nama_dosen;
	}

	public string getNip() {
		return this.nip;
	}

	/**
	 * 
	 * @param nip
	 */
	public void setNip(string nip) {
		this.nip = nip;
	}

}