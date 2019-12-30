public class Shinobi {
	private String noreg, nama, peringkat;

	public void setNoreg(String noreg){
		this.noreg = noreg;
	}

	public String getNoreg(){
		return noreg;
	}

	public void setNama(String nama){
		this.nama = nama;
	}

	public String getNama(){
		return nama;
	}

	public void setPeringkat(String peringkat){
		this.peringkat = peringkat;
	}

	public String getPeringkat(){
		return peringkat;
	}
}

class Main{
	public static void main(String[] args) {
		Shinobi[] s = new Shinobi[3];

		s[0] = new Shinobi();
		s[0].setNoreg("012606");
		s[0].setNama("Uchiha Sasuke");
		s[0].setPeringkat("Genin");

		s[1] = new Shinobi();
		s[1].setNoreg("012607");
		s[1].setNama("Uzumaki Naruto");
		s[1].setPeringkat("Genin");

		s[2] = new Shinobi();
		s[2].setNoreg("012601");
		s[2].setNama("Haruno Sakura");
		s[2].setPeringkat("Genin");

		System.out.println("Data Shinobi");
		for(Shinobi x:s){
			System.out.println("\nNomor Registrasi " + x.getNoreg());
			System.out.println("Nama " + x.getNama());
			System.out.println("Peringkat " + x.getPeringkat());
		}
	}
}