
public class BangunDatarFactory {
	
	//factory method
	public BangunDatar getBangunDatar(String namaBangunDatar){
		if(namaBangunDatar.equalsIgnoreCase("persegi"))
			return new Persegi();
		else if(namaBangunDatar.equalsIgnoreCase("lingkaran"))
			return new Lingkaran();
		else
			return null;
	}
}
