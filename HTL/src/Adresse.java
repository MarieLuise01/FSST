
public class Adresse {
	private
		String ort;
		String strasse;
		int hausnummer;
		int plz;
		
	
	public
	
	Adresse(){}
	Adresse(String strasse, int hausnummer, int plz, String ort){
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.plz = plz;
		this.ort = ort;
	}
	//getters
	
	String getOrt(){
		return ort;
	}
	
	String getStrasse(){
		return strasse;
	}
	
	int getHausnummer(){
		return hausnummer;
	}
	
	int getPlz(){
		return plz;
	}
	
	//setters
	
	void setOrt(String ort) {
		this.ort = ort;
	}
	
	void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	
	void setHausnummer(int hausnummer) {
		this.hausnummer = hausnummer;
	}
	
	void setPlz(int plz) {
		this.plz = plz;
	}
	
	void printAdresse(){
		System.out.println(strasse + " " + hausnummer + "\n" + plz + " " + ort);
	}
}
